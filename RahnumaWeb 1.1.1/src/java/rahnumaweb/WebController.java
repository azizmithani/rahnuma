/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rahnumaweb;

import com.sun.webui.jsf.model.Option;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import systemobject.Organism;
import rahnumautilities.Parameter;
import rahnumautilities.RahnumaJob;
import rahnumautilities.Utilities;
import systemobject.PhyloTree;

/**
 *
 * @author mithani
 */
public class WebController {

    /** Creates a new instance of Controller */
    public WebController() {
    }

    public void initialiseMainPage(SessionBean1 sb) {

        // Job Name
        sb.setJobName("");
        // Email
        sb.setEmail("");
        // Dataset Option
        sb.setSelectedOptionDataset(sb.getDatasetOptions()[0].getValue().toString());
        // Selected Dataset Subset
        sb.setSelectedDatasetSubset(sb.getDatasetSubset()[0].getValue().toString());
        // Read Dataset 
        String setId = sb.getSelectedDatasetSubset().equals(Parameter.OPTION_SET_COMPLETE) ? "" : sb.getSelectedDatasetSubset();
        sb.setDataset(getOptionArray(markCuratedPathways(sb.getDatabase().getKEGGPathways(setId)), true));
        // Dataset
        sb.setSelectedDataset(new String[]{});
        // Analysis
        sb.setSelectedAnalysis(sb.getAnalysis()[0].getValue().toString());
        // Analysis Type
        if (sb.getAnalysisType() != null && sb.getAnalysisType().length != 0) {
            sb.setSelectedAnalysisType(sb.getAnalysisType()[0].getValue().toString());
        }
        // Analysis Mode
        if (sb.getAnalysisMode() != null && sb.getAnalysisMode().length != 0) {
            sb.setSelectedAnalysisMode(sb.getAnalysisMode()[0].getValue().toString());
        }
        // Comparison Mode
        if (sb.getComparisonMode() != null && sb.getComparisonMode().length != 0) {
            sb.setSelectedComparisonMode(sb.getComparisonMode()[0].getValue().toString());
        }
        // Phylogenetic/Network Mode
        if (sb.getPhylogeneticMode() != null && sb.getPhylogeneticMode().length != 0) {
            sb.setSelectedPhylogeneticMode(sb.getPhylogeneticMode()[0].getValue().toString());
        }
        // Output Type
        sb.setSelectedOutputType(sb.getOutputTypes()[0].getValue().toString());
        // Output Format
        sb.setSelectedOutputFormat(sb.getOutputFormats()[0].getValue().toString());

    }

    public void initialiseParametersPage(SessionBean1 sb) {

        // Organism 1 Option
        sb.setSelectedOptionOrganism1(sb.getOrganism1Options()[0].getValue().toString());
        // Organism 2 Option
        sb.setSelectedOptionOrganism2(sb.getOrganism2Options()[0].getValue().toString());
        // Selected Organism 1 Set
        sb.setSelectedOrganism1Set(sb.getOrganism1Set()[0].getValue().toString());
        // Selected Organism 2 Set
        sb.setSelectedOrganism2Set(sb.getOrganism2Set()[0].getValue().toString());
        // Read Organism 1 List
        sb.setOrganismList1(getOptionArray(sb.getDatabase().getOrganisms(sb.getSelectedOrganism1Set()), true));
        // Read Organism 3 List
        sb.setOrganismList2(getOptionArray(sb.getDatabase().getOrganisms(sb.getSelectedOrganism2Set()), true));
        // Organism 1 Mode
        sb.setSelectedOrganism1Mode(sb.getOrganismModes()[0].getValue().toString());
        // Organism 2 Mode
        sb.setSelectedOrganism2Mode(sb.getOrganismModes()[0].getValue().toString());
        // Organism 1
        sb.setSelectedOrganisms1(new String[]{});
        // Organism 2
        sb.setSelectedOrganisms2(new String[]{});

        String[] pwCodes;
        if (sb.getSelectedOptionDataset().equals(Parameter.OPTION_DATASET_OPTION_COMPLETE))
            pwCodes = new String[]{};
        else if (sb.getSelectedOptionDataset().equals(Parameter.OPTION_DATASET_OPTION_CURATED))
            pwCodes = Utilities.extractColumn(sb.getDatabase().getCuratedKEGGPathways(new String[]{}),0);
        else
            pwCodes = sb.getSelectedDataset();
        
        // Selected Start Metabolites Set
        sb.setSelectedStartMetaboliteSet(sb.getStartMetaboliteSet()[0].getValue().toString());
        // Selected End Metabolites Set
        sb.setSelectedEndMetaboliteSet(sb.getEndMetaboliteSet()[0].getValue().toString());

        // Read Start Metabolites
        sb.setStartMetabolitesList(getOptionArray(sb.getDatabase().getMetabolites(pwCodes, sb.getSelectedStartMetaboliteSet()), true));
        // Read End Metabolites
        sb.setEndMetabolitesList(getOptionArray(sb.getDatabase().getMetabolites(pwCodes, sb.getSelectedEndMetaboliteSet()), true));
        // Pathway Prediction Mode
        sb.setSelectedPathwayPredictionMode(sb.getPathwayPredictionModes()[0].getValue().toString());
        // Connection Option
        sb.setSelectedConnectionOption(sb.getConnectionOptions()[0].getValue().toString());

        // Set selected Return Value and its visibility
        boolean returnChoice = sb.getSelectedAnalysis().equals(Parameter.OPTION_ANALYSIS_PATHWAY) & sb.getSelectedAnalysisType().equals(Parameter.OPTION_ANALYSIS_TYPE_PREDICTION);
        returnChoice = returnChoice || (sb.getSelectedAnalysis().equals(Parameter.OPTION_ANALYSIS_COMPARATIVE) && sb.getSelectedComparisonMode() != null && sb.getSelectedComparisonMode().equals(Parameter.OPTION_COMPARISON_MODE_PATHWAY));
        sb.setSelectedReturnValue(returnChoice ? Parameter.OPTION_RETURN_VALUE_PATHWAY : Parameter.OPTION_RETURN_VALUE_REACTION);

        // set Start / End Metabolites
        sb.setSelectedStartMetabolites(new String[]{});
        sb.setSelectedEndMetabolites(new String[]{});

        // set phylogeny
        sb.setPhylogeny("");
    }

    public void getMainPageData(SessionBean1 sb) {

        // if the data has already been downloaded then no need to refetch it.
        if (sb.isMainPageDataDownloaded()) {
            return;
        }

        // Dataset subset
        sb.setDatasetSubset(getDatasetSubsets(sb));

        // Dataset options
        sb.setDatasetOptions(getDatasetOptions());
        
        // set the flag for data downloaded
        sb.setMainPageDataDownloaded(true);
    }
    
    public void getParameterPageData(SessionBean1 sb) {

        // Pathway specific parameters
        // Connection Options
        sb.setConnectionOptions(getConnectionOptions(sb));

        String[] pwCodes;
        if (sb.getSelectedOptionDataset().equals(Parameter.OPTION_DATASET_OPTION_COMPLETE))
            pwCodes = new String[]{};
        else if (sb.getSelectedOptionDataset().equals(Parameter.OPTION_DATASET_OPTION_CURATED))
            pwCodes = Utilities.extractColumn(sb.getDatabase().getCuratedKEGGPathways(new String[]{}),0);
        else
            pwCodes = sb.getSelectedDataset();


        // Start Metabolite Set
        sb.setStartMetaboliteSet(getMetaboliteSets(sb, pwCodes));
        // End Metabolite Set
        sb.setEndMetaboliteSet(getMetaboliteSets(sb, pwCodes));
        
        // if the data has already been downloaded then no need to refetch it.
        if (sb.isParameterPageDataDownloaded()) {
            return;
        }

        // Parameters
        // Organism 1 Set
        sb.setOrganism1Set(getOrganismSets(sb));
        // Organism 2 Set
        sb.setOrganism2Set(getOrganismSets(sb));

        // Organism 1 options
        sb.setOrganism1Options(getOrganismOptions());
        // Organism 2 options
        sb.setOrganism2Options(getOrganismOptions());

        // Organism Mode
        sb.setOrganismModes(getOrganismModes());

        // Cutoff length
        sb.setCutoffLength(5);
        // Return Value
        sb.setReturnValues(getReturnValues());
        // Mode
        sb.setPathwayPredictionModes(getPathwayPredictionModes());

        // Neighbourhood cutoff proportion 
        sb.setCutoffNeighbourhood1(0.75);
        sb.setCutoffNeighbourhood2(0.75);
        
        // set the flag for data downloaded
        sb.setParameterPageDataDownloaded(true);
    }

    public void refreshDataset(SessionBean1 sb) {
        String setId = (sb.getSelectedDatasetSubset().equals(Parameter.OPTION_SET_COMPLETE) ? "" : sb.getSelectedDatasetSubset());
        if (setId.length() == 0)
            sb.setSelectedDataset(new String[] {});
        String[][] dataset;
        if (sb.getSelectedDatasetSubset().equals(Parameter.OPTION_SET_CURATED))
            dataset = sb.getDatabase().getCuratedKEGGPathways(sb.getSelectedDataset());
        else
            dataset = sb.getDatabase().getKEGGPathways(setId, sb.getSelectedDataset());
        String[][] newDataset = new String[dataset.length + sb.getSelectedDataset().length][];
        // copy the organisms to the new array
        int j = 0;
        for (int i = 0; i < dataset.length; i++) {
            newDataset[j++] = dataset[i];
        }
        // get the details of the already selected dataset
        String[][] selectedDataset = sb.getDatabase().getKEGGPathways(sb.getSelectedDataset());
        
        // copy them to the array
        for (int i = 0; i < selectedDataset.length; i++) {
            newDataset[j++] = selectedDataset[i];
        }
        sb.setDataset(getOptionArray(markCuratedPathways(newDataset), true));
        sb.setSelectedDataset(sb.getSelectedDataset() == null ? new String[]{} : sb.getSelectedDataset());
    }

    private String[][] markCuratedPathways(String[][] keggPathways){
        for (int i = 0; i < keggPathways.length; i++) {
            if (keggPathways[i][3].equals("Y"))
                keggPathways[i][1] = "(+) " + keggPathways[i][1];
        }

        return keggPathways;
    }
    
    public void refreshOrganism1List(SessionBean1 sb) {
        String setId = sb.getSelectedOrganism1Set().equals(Parameter.OPTION_SET_COMPLETE) ? "" : sb.getSelectedOrganism1Set();
        String[][] orgList = sb.getDatabase().getOrganisms(setId, sb.getSelectedOrganisms1());
        String[][] newOrgList = new String[orgList.length + sb.getSelectedOrganisms1().length][];
        // copy the organisms to the new array
        int j = 0;
        for (int i = 0; i < orgList.length; i++) {
            newOrgList[j++] = orgList[i];
        }
        // get the details of the already selected organisms
        String[][] selectedOrgList = sb.getDatabase().getOrganisms(sb.getSelectedOrganisms1());
        // copy them to the array
        for (int i = 0; i < selectedOrgList.length; i++) {
            newOrgList[j++] = selectedOrgList[i];
        }
        sb.setOrganismList1(getOptionArray(newOrgList, true));
        sb.setSelectedOrganisms1(sb.getSelectedOrganisms1() == null ? new String[]{} : sb.getSelectedOrganisms1());
    }

    public void refreshOrganism2List(SessionBean1 sb) {
        String setId = sb.getSelectedOrganism2Set().equals(Parameter.OPTION_SET_COMPLETE) ? "" : sb.getSelectedOrganism2Set();
        String[][] orgList = sb.getDatabase().getOrganisms(setId, sb.getSelectedOrganisms2());
        String[][] newOrgList = new String[orgList.length + sb.getSelectedOrganisms2().length][];
        // copy the organisms to the new array
        int j = 0;
        for (int i = 0; i < orgList.length; i++) {
            newOrgList[j++] = orgList[i];
        }
        // get the details of the already selected organisms
        String[][] selectedOrgList = sb.getDatabase().getOrganisms(sb.getSelectedOrganisms2());
        // copy them to the array
        for (int i = 0; i < selectedOrgList.length; i++) {
            newOrgList[j++] = selectedOrgList[i];
        }
        sb.setOrganismList2(getOptionArray(newOrgList, true));
        sb.setSelectedOrganisms2(sb.getSelectedOrganisms2() == null ? new String[]{} : sb.getSelectedOrganisms2());
    }

    public void refreshStartMetabolites(SessionBean1 sb) {
        String setId = sb.getSelectedStartMetaboliteSet().equals(Parameter.OPTION_SET_COMPLETE) ? "" : sb.getSelectedStartMetaboliteSet();
        String[] pwCodes;
        if (sb.getSelectedOptionDataset().equals(Parameter.OPTION_DATASET_OPTION_COMPLETE))
            pwCodes = new String[]{};
        else if (sb.getSelectedOptionDataset().equals(Parameter.OPTION_DATASET_OPTION_CURATED))
            pwCodes = Utilities.extractColumn(sb.getDatabase().getCuratedKEGGPathways(new String[]{}),0);
        else
            pwCodes = sb.getSelectedDataset();
//        String[][] mtbList = sb.getDatabase().getMetabolites(setId, sb.getSelectedStartMetabolites());
        String[][] mtbList = sb.getDatabase().getMetabolites(pwCodes, setId, sb.getSelectedStartMetabolites());
        String[][] newMtbList = new String[mtbList.length + sb.getSelectedStartMetabolites().length][];
        // copy the metabolites to the new array
        int j = 0;
        for (int i = 0; i < mtbList.length; i++) {
            newMtbList[j++] = mtbList[i];
        }
        // get the details of the already selected metabolites
        String[][] selectedMtbList = sb.getDatabase().getMetabolites(sb.getSelectedStartMetabolites());
        // copy them to the array
        for (int i = 0; i < selectedMtbList.length; i++) {
            newMtbList[j++] = selectedMtbList[i];
        }
        sb.setStartMetabolitesList(getOptionArray(newMtbList, true));
        sb.setSelectedStartMetabolites(sb.getSelectedStartMetabolites() == null ? new String[]{} : sb.getSelectedStartMetabolites());
    }

    public void refreshEndMetabolites(SessionBean1 sb) {
        String setId = sb.getSelectedEndMetaboliteSet().equals(Parameter.OPTION_SET_COMPLETE) ? "" : sb.getSelectedEndMetaboliteSet();
        String[] pwCodes;
        if (sb.getSelectedOptionDataset().equals(Parameter.OPTION_DATASET_OPTION_COMPLETE))
            pwCodes = new String[]{};
        else if (sb.getSelectedOptionDataset().equals(Parameter.OPTION_DATASET_OPTION_CURATED))
            pwCodes = Utilities.extractColumn(sb.getDatabase().getCuratedKEGGPathways(new String[]{}),0);
        else
            pwCodes = sb.getSelectedDataset();
//        String[][] mtbList = sb.getDatabase().getMetabolites(setId, sb.getSelectedEndMetabolites());
        String[][] mtbList = sb.getDatabase().getMetabolites(pwCodes, setId, sb.getSelectedEndMetabolites());
        String[][] newMtbList = new String[mtbList.length + sb.getSelectedEndMetabolites().length][];
        // copy the metabolites to the new array
        int j = 0;
        for (int i = 0; i < mtbList.length; i++) {
            newMtbList[j++] = mtbList[i];
        }
        // get the details of the already selected metabolites
        String[][] selectedMtbList = sb.getDatabase().getMetabolites(sb.getSelectedEndMetabolites());
        // copy them to the array
        for (int i = 0; i < selectedMtbList.length; i++) {
            newMtbList[j++] = selectedMtbList[i];
        }
        sb.setEndMetabolitesList(getOptionArray(newMtbList, true));
        sb.setSelectedEndMetabolites(sb.getSelectedEndMetabolites() == null ? new String[]{} : sb.getSelectedEndMetabolites());
    }

    public void refreshOrganism1(SessionBean1 sb) {
        if (sb.getSelectedOptionOrganism1().toString().equals(Parameter.OPTION_ORGANISM_OPTION_REFERENCE)) {
            sb.setSelectedOrganisms1(new String[]{});
        }
    }

    public void refreshAnalysisOptions(SessionBean1 sb) {

        // Analysis Type
        Option[] analysisType = getAnalysisTypes(sb.getSelectedAnalysis());
        sb.setAnalysisType(analysisType);
        if (sb.getSelectedAnalysisType() == null || !isValidOption(analysisType, sb.getSelectedAnalysisType())) {
            sb.setSelectedAnalysisType(analysisType[0].getValue().toString());
        }
        // help
        sb.setHelpAnalysisType((String)sb.getHelpTexts().get(Parameter.HELP_ANALYSIS_TYPE + sb.getSelectedAnalysis()));
        
        // Analysis Mode
        Option[] analysisMode = getAnalysisModes(sb.getSelectedAnalysis());
        sb.setAnalysisMode(analysisMode);
        if (sb.getSelectedAnalysisMode() == null || !isValidOption(analysisMode, sb.getSelectedAnalysisMode())) {
            sb.setSelectedAnalysisMode(analysisMode[0].getValue().toString());
        }
        // help
        sb.setHelpAnalysisMode((String)sb.getHelpTexts().get(Parameter.HELP_ANALYSIS_MODE + sb.getSelectedAnalysis()));

        // Comparison Mode
        Option[] comparisonMode = getComparisonModes();
        sb.setComparisonMode(comparisonMode);
        if (sb.getSelectedComparisonMode() == null || !isValidOption(comparisonMode, sb.getSelectedComparisonMode())) {
            sb.setSelectedComparisonMode(comparisonMode[0].getValue().toString());
        }
        // help
        sb.setHelpComparisonMode((String)sb.getHelpTexts().get(Parameter.HELP_COMPARISON_MODE));

        // Phylogenetic Mode
        Option[] phyloMode = getPhylogeneticModes(sb.getSelectedAnalysisMode());
        sb.setPhylogeneticMode(phyloMode);
        if (sb.getSelectedPhylogeneticMode() == null || !isValidOption(phyloMode, sb.getSelectedPhylogeneticMode())) {
            sb.setSelectedPhylogeneticMode(phyloMode[0].getValue().toString());
        }
        // help
        sb.setHelpNetworkMode((String)sb.getHelpTexts().get(Parameter.HELP_NETWORK_MODE + sb.getSelectedAnalysisMode()));

    }

    private boolean isValidOption(Option[] options, String selectedOption) {

        for (int i = 0; i < options.length; i++) {
            if (options[i].getValue().equals(selectedOption)) {
                return true;
            }
        }

        return false;
    }

    public Option[] getAnalyses() {

        return new Option[]{
            new Option(Parameter.OPTION_ANALYSIS_PATHWAY, (String) Parameter.getUIOptions().get(Parameter.OPTION_ANALYSIS_PATHWAY)),
            new Option(Parameter.OPTION_ANALYSIS_COMPARATIVE, (String) Parameter.getUIOptions().get(Parameter.OPTION_ANALYSIS_COMPARATIVE)),
            new Option(Parameter.OPTION_ANALYSIS_NETWORK, (String) Parameter.getUIOptions().get(Parameter.OPTION_ANALYSIS_NETWORK))
        };
    }

    public Option[] getAnalysisTypes(String selectedAnalysis) {

        Option[] analysisType;

        if (selectedAnalysis.equals(Parameter.OPTION_ANALYSIS_PATHWAY)) {
            // Analysis Type - pathway
            analysisType = new Option[]{
                new Option(Parameter.OPTION_ANALYSIS_TYPE_PREDICTION, (String) Parameter.getUIOptions().get(Parameter.OPTION_ANALYSIS_TYPE_PREDICTION)),
                new Option(Parameter.OPTION_ANALYSIS_TYPE_EXCLUSIVE_RXN, (String) Parameter.getUIOptions().get(Parameter.OPTION_ANALYSIS_TYPE_EXCLUSIVE_RXN)),
                new Option(Parameter.OPTION_ANALYSIS_TYPE_BRIDGE_RXN, (String) Parameter.getUIOptions().get(Parameter.OPTION_ANALYSIS_TYPE_BRIDGE_RXN))
            };
        } else if (selectedAnalysis.equals(Parameter.OPTION_ANALYSIS_COMPARATIVE)) {
            // Analysis Type - comparative
            analysisType = new Option[]{
                new Option(Parameter.OPTION_ANALYSIS_TYPE_STANDARD, (String) Parameter.getUIOptions().get(Parameter.OPTION_ANALYSIS_TYPE_STANDARD)),
                new Option(Parameter.OPTION_ANALYSIS_TYPE_ALL_BUT_ONE, (String) Parameter.getUIOptions().get(Parameter.OPTION_ANALYSIS_TYPE_ALL_BUT_ONE))
            };
        } else if (selectedAnalysis.equals(Parameter.OPTION_ANALYSIS_NETWORK)) {
            // Analysis Type - network
            analysisType = new Option[]{
                new Option(Parameter.OPTION_ANALYSIS_TYPE_ANCESTRAL, (String) Parameter.getUIOptions().get(Parameter.OPTION_ANALYSIS_TYPE_ANCESTRAL))
            };
        } else {
            analysisType = new Option[]{};
        }

        return analysisType;
    }

    public Option[] getAnalysisModes(String selectedAnalysis) {

        Option[] analysisMode;

        if (selectedAnalysis.equals(Parameter.OPTION_ANALYSIS_PATHWAY)) {
            analysisMode = new Option[]{
                new Option(Parameter.OPTION_ANALYSIS_MODE_ORGANISM, (String) Parameter.getUIOptions().get(Parameter.OPTION_ANALYSIS_MODE_ORGANISM)),
                new Option(Parameter.OPTION_ANALYSIS_MODE_PHYLOGENY, (String) Parameter.getUIOptions().get(Parameter.OPTION_ANALYSIS_MODE_PHYLOGENY))
            };
        } else if (selectedAnalysis.equals(Parameter.OPTION_ANALYSIS_COMPARATIVE)) {
            analysisMode = new Option[]{
                new Option(Parameter.OPTION_ANALYSIS_MODE_ORGANISM, (String) Parameter.getUIOptions().get(Parameter.OPTION_ANALYSIS_MODE_ORGANISM)),
                new Option(Parameter.OPTION_ANALYSIS_MODE_PHYLOGENY, (String) Parameter.getUIOptions().get(Parameter.OPTION_ANALYSIS_MODE_PHYLOGENY))
            };
        } else if (selectedAnalysis.equals(Parameter.OPTION_ANALYSIS_NETWORK)) {
            analysisMode = new Option[]{
                new Option(Parameter.OPTION_NETWORK_BUILDING_UNION, (String) Parameter.getUIOptions().get(Parameter.OPTION_NETWORK_BUILDING_UNION)),
                new Option(Parameter.OPTION_NETWORK_BUILDING_INTERSECTION, (String) Parameter.getUIOptions().get(Parameter.OPTION_NETWORK_BUILDING_INTERSECTION)),
                new Option(Parameter.OPTION_NETWORK_BUILDING_NEIGHBOURHOOD, (String) Parameter.getUIOptions().get(Parameter.OPTION_NETWORK_BUILDING_NEIGHBOURHOOD)),
                new Option(Parameter.OPTION_NETWORK_BUILDING_PARSIMONY, (String) Parameter.getUIOptions().get(Parameter.OPTION_NETWORK_BUILDING_PARSIMONY))
            };
        } else {
            analysisMode = new Option[]{};
        }

        return analysisMode;
    }

    public Option[] getComparisonModes() {

        return new Option[]{
            new Option(Parameter.OPTION_COMPARISON_MODE_PATHWAY, (String) Parameter.getUIOptions().get(Parameter.OPTION_COMPARISON_MODE_PATHWAY)),
            new Option(Parameter.OPTION_COMPARISON_MODE_FULL, (String) Parameter.getUIOptions().get(Parameter.OPTION_COMPARISON_MODE_FULL))
        };
    }

    public Option[] getPhylogeneticModes(String selectedAnalysisMode) {

        if (selectedAnalysisMode.equals(Parameter.OPTION_ANALYSIS_MODE_PHYLOGENY)) {
            return new Option[]{
                new Option(Parameter.OPTION_NETWORK_BUILDING_UNION, (String) Parameter.getUIOptions().get(Parameter.OPTION_NETWORK_BUILDING_UNION)),
                new Option(Parameter.OPTION_NETWORK_BUILDING_INTERSECTION, (String) Parameter.getUIOptions().get(Parameter.OPTION_NETWORK_BUILDING_INTERSECTION)),
                new Option(Parameter.OPTION_NETWORK_BUILDING_NEIGHBOURHOOD, (String) Parameter.getUIOptions().get(Parameter.OPTION_NETWORK_BUILDING_NEIGHBOURHOOD)),
                new Option(Parameter.OPTION_NETWORK_BUILDING_PARSIMONY, (String) Parameter.getUIOptions().get(Parameter.OPTION_NETWORK_BUILDING_PARSIMONY))
            };
        } else {
            return new Option[]{
                new Option(Parameter.OPTION_ANALYSIS_MODE_INDIVIDUAL, (String) Parameter.getUIOptions().get(Parameter.OPTION_ANALYSIS_MODE_INDIVIDUAL)),
                new Option(Parameter.OPTION_ANALYSIS_MODE_COLLECTIVE, (String) Parameter.getUIOptions().get(Parameter.OPTION_ANALYSIS_MODE_COLLECTIVE))
            };
        }
    }

    public Option[] getDatasetOptions() {
        return new Option[]{
            new Option(Parameter.OPTION_DATASET_OPTION_COMPLETE, (String) Parameter.getUIOptions().get(Parameter.OPTION_DATASET_OPTION_COMPLETE)),
            new Option(Parameter.OPTION_DATASET_OPTION_CURATED, (String) Parameter.getUIOptions().get(Parameter.OPTION_DATASET_OPTION_CURATED)),
            new Option(Parameter.OPTION_DATASET_OPTION_SELECT, (String) Parameter.getUIOptions().get(Parameter.OPTION_DATASET_OPTION_SELECT))
        };
    }
    
    public Option[] getDatasetSubsets(SessionBean1 sb) {
        // Read Dataset subset from DB
        String[][] datasetTemp = sb.getDatabase().getKEGGPathwaySets();
        // Create a new set with additional elements "All available pathways", "All Curatd Pathways"
        String[][] dataset = new String[datasetTemp.length + 2][2];
        // Add the "All available pathways" entry
        dataset[0] = new String[]{Parameter.OPTION_SET_COMPLETE, (String) Parameter.getUIOptions().get(Parameter.OPTION_SET_COMPLETE)};
        // Add the "All curated pathways" entry
        dataset[1] = new String[]{Parameter.OPTION_SET_CURATED, (String) Parameter.getUIOptions().get(Parameter.OPTION_SET_CURATED)};
        // Copy the set obtained from db
        for (int i = 0; i < datasetTemp.length; i++) {
            dataset[i+2] = datasetTemp[i];
        }

        return getOptionArray(dataset, false);
    }
    
    public Option[] getOrganismOptions() {
        return new Option[]{
            new Option(Parameter.OPTION_ORGANISM_OPTION_REFERENCE, (String) Parameter.getUIOptions().get(Parameter.OPTION_ORGANISM_OPTION_REFERENCE)),
            new Option(Parameter.OPTION_ORGANISM_OPTION_SELECT, (String) Parameter.getUIOptions().get(Parameter.OPTION_ORGANISM_OPTION_SELECT))
        };
    }
    
    public Option[] getOrganisms(SessionBean1 sb) {
        return getOptionArray(sb.getDatabase().getOrganisms(""), true);
    }

    public Option[] getOrganismModes() {

        return new Option[]{
            new Option(Parameter.OPTION_NETWORK_BUILDING_UNION, (String) Parameter.getUIOptions().get(Parameter.OPTION_NETWORK_BUILDING_UNION)),
                new Option(Parameter.OPTION_NETWORK_BUILDING_INTERSECTION, (String) Parameter.getUIOptions().get(Parameter.OPTION_NETWORK_BUILDING_INTERSECTION)),
                new Option(Parameter.OPTION_NETWORK_BUILDING_NEIGHBOURHOOD, (String) Parameter.getUIOptions().get(Parameter.OPTION_NETWORK_BUILDING_NEIGHBOURHOOD))
        };
    }

    public Option[] getMetaboliteSets(SessionBean1 sb, String[] pwCodes) {
        // Read Metabolite Set from DB
        String[][] mtbSetTemp = sb.getDatabase().getMetaboliteSets(pwCodes);
        // Create a new set with additional element "Complete Set"
        String[][] mtbSet = new String[mtbSetTemp.length + 1][2];
        // Copy the set obtained from db
        for (int i = 0; i < mtbSetTemp.length; i++) {
            mtbSet[i] = mtbSetTemp[i];
        }
        // Add the "complete set" entry
        mtbSet[mtbSetTemp.length] = new String[]{Parameter.OPTION_SET_COMPLETE, (String) Parameter.getUIOptions().get(Parameter.OPTION_SET_COMPLETE)};

        return getOptionArray(mtbSet, false);
    }

    public Option[] getOrganismSets(SessionBean1 sb) {
        // Read Organism Set from DB
        String[][] orgSetTemp = sb.getDatabase().getOrganismSets();
        // Create a new set with additional element "Complete Set"
        String[][] orgSet = new String[orgSetTemp.length + 1][2];
        // Copy the set obtained from db
        for (int i = 0; i < orgSetTemp.length; i++) {
            orgSet[i] = orgSetTemp[i];
        }
        // Add the "complete set" entry
        orgSet[orgSetTemp.length] = new String[]{Parameter.OPTION_SET_COMPLETE, (String) Parameter.getUIOptions().get(Parameter.OPTION_SET_COMPLETE)};

        return getOptionArray(orgSet, false);
    }

    public Option[] getReturnValues() {
        return new Option[]{
            new Option(Parameter.OPTION_RETURN_VALUE_PATHWAY, (String) Parameter.getUIOptions().get(Parameter.OPTION_RETURN_VALUE_PATHWAY)),
            new Option(Parameter.OPTION_RETURN_VALUE_REACTION, (String) Parameter.getUIOptions().get(Parameter.OPTION_RETURN_VALUE_REACTION))
        };
    }

    public Option[] getPathwayPredictionModes() {
        return new Option[]{
            new Option(Parameter.OPTION_PREDICTION_MODE_CONNECTION, (String) Parameter.getUIOptions().get(Parameter.OPTION_PREDICTION_MODE_CONNECTION)),
            new Option(Parameter.OPTION_PREDICTION_MODE_REACTION, (String) Parameter.getUIOptions().get(Parameter.OPTION_PREDICTION_MODE_REACTION))
        };
    }

    public Option[] getConnectionOptions(SessionBean1 sb) {
        if (sb.getSelectedOptionDataset().equals(Parameter.OPTION_DATASET_OPTION_CURATED) || allCuratedPathways(sb, sb.getSelectedDataset()))
            return new Option[]{
                new Option(Parameter.OPTION_CONNECTION_OPTION_CARBON, (String) Parameter.getUIOptions().get(Parameter.OPTION_CONNECTION_OPTION_CARBON)),
                new Option(Parameter.OPTION_CONNECTION_OPTION_NITROGEN, (String) Parameter.getUIOptions().get(Parameter.OPTION_CONNECTION_OPTION_NITROGEN)),
                new Option(Parameter.OPTION_CONNECTION_OPTION_KEGG_RPAIR, (String) Parameter.getUIOptions().get(Parameter.OPTION_CONNECTION_OPTION_KEGG_RPAIR))
            // Temporary .. we are not allowing users to specify connection file
            // Also commented the relevant line in the prerender() function of the Parameters page
     //           new Option(Parameter.OPTION_CONNECTION_OPTION_FILE, (String)Parameter.getUIOptions().get(Parameter.OPTION_CONNECTION_OPTION_FILE))};
            };
        else
            return new Option[]{
                new Option(Parameter.OPTION_CONNECTION_OPTION_KEGG_RPAIR, (String) Parameter.getUIOptions().get(Parameter.OPTION_CONNECTION_OPTION_KEGG_RPAIR))
            };
            
    }

    public Option[] getOutputTypes() {
        return new Option[]{
            new Option(Parameter.OPTION_OUTPUT_TYPE_TABULAR, (String) Parameter.getUIOptions().get(Parameter.OPTION_OUTPUT_TYPE_TABULAR)),
            new Option(Parameter.OPTION_OUTPUT_TYPE_DESCRIPTIVE, (String) Parameter.getUIOptions().get(Parameter.OPTION_OUTPUT_TYPE_DESCRIPTIVE))
        };
    }

    public Option[] getOutputFormats() {
        return new Option[]{
            new Option(Parameter.OPTION_OUTPUT_FORMAT_TEXT, (String) Parameter.getUIOptions().get(Parameter.OPTION_OUTPUT_FORMAT_TEXT)),
            new Option(Parameter.OPTION_OUTPUT_FORMAT_HTML, (String) Parameter.getUIOptions().get(Parameter.OPTION_OUTPUT_FORMAT_HTML))
        };
    }

    public boolean validateSelectedMetabolites(String[] startMetabolites, String[] endMetabolites) {
        // Checks if the selected start and end metabolites are exclusive i.e. dont have any metabolite in common
        for (int i = 0; i < startMetabolites.length; i++) {
            for (int j = 0; j < endMetabolites.length; j++) {
                if (startMetabolites[i].equals(endMetabolites[j])) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean validateStartMetabolites(SessionBean1 sb, String[] startMetabolites) {

        int minSelect;
        if (sb.getSelectedAnalysis().equals(Parameter.OPTION_ANALYSIS_PATHWAY) && sb.getSelectedAnalysisType().equals(Parameter.OPTION_ANALYSIS_TYPE_EXCLUSIVE_RXN)) {
            minSelect = 2;
        } else {
            minSelect = 1;
        }

        // return true if at least "minSelect" metabolites are selected
        if (startMetabolites.length < minSelect) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validateEndMetabolites(SessionBean1 sb, String[] endMetabolites) {

        int minSelect = 1;

        // return true if at least "minSelect" metabolites are selected
        if (endMetabolites.length < minSelect) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validateOrganisms(SessionBean1 sb, String[] organisms) {

        int minSelect;
        if (sb.getSelectedAnalysisType().equals(Parameter.OPTION_ANALYSIS_TYPE_ALL_BUT_ONE)) {
            minSelect = 2;
        } else {
            minSelect = 1;
        }

        // return true if at least "minSelect" organism are selected
        if (organisms.length < minSelect) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validateDataset(String[] dataset) {

        int minSelect = 1;

        // return true if at least "minSelect" dataset are selected
        if (dataset.length < minSelect) {
            return false;
        } else {
            return true;
        }
    }

    public String validatePhylogeny(SessionBean1 sb, String phylogeny) {

        if (phylogeny.trim().isEmpty()) {
            return "Please specify a phylogeny";
        }
        return validatePhylogeny(phylogeny, Organism.buildList(sb.getDatabase().getOrganisms("")));
    }

    public boolean validateCutoffLength(int length, SessionBean1 sb) {

        return (sb.getSessionParameters().getMinCutoffLength() <= length && length <= sb.getSessionParameters().getMaxCutoffLength());
    }

    public boolean validateCutoffProportionNeighbourhood(double proportion, SessionBean1 sb) {

        return (sb.getSessionParameters().getMinCutoffProportionNeighbourhood() < proportion && proportion < sb.getSessionParameters().getMaxCutoffProportionNeighbourhood());
    }
    
    public boolean submitJob(SessionBean1 sb) {

        // set submission date
        sb.setJobDateTime(new Date());

        // Set IP Address
        try {
            sb.setIPAddress(InetAddress.getLocalHost().getHostAddress());
        } catch (Exception ue) {
            sb.setIPAddress("UNKNOWN");
        }

        // create and submit the job. Also remove the unwanted values from the job before submitting
        return sb.getDatabase().submitJob(refreshSelections(createJob(sb)));

    }

    private RahnumaJob refreshSelections(RahnumaJob job) {
        // removes the entries from unwanted selectedX variables and sets them to null

        boolean completeDataset = job.getDatasetOption().equals(Parameter.OPTION_DATASET_OPTION_COMPLETE);
        boolean curatedDataset = job.getDatasetOption().equals(Parameter.OPTION_DATASET_OPTION_CURATED);
        boolean comparativeAnalysis = job.getAnalysis().equals(Parameter.OPTION_ANALYSIS_COMPARATIVE);
        boolean phyloAnalysis = (job.getAnalysis().equals(Parameter.OPTION_ANALYSIS_NETWORK) && job.getAnalysisType().equals(Parameter.OPTION_ANALYSIS_TYPE_ANCESTRAL)) || job.getAnalysisMode().equals(Parameter.OPTION_ANALYSIS_MODE_PHYLOGENY);
        boolean pathwayAnalysis = job.getAnalysis().equals(Parameter.OPTION_ANALYSIS_PATHWAY) || (job.getAnalysis().equals(Parameter.OPTION_ANALYSIS_COMPARATIVE) & job.getComparisonMode().equals(Parameter.OPTION_COMPARISON_MODE_PATHWAY));
        boolean connectionMode = job.getPredictionMode().equals(Parameter.OPTION_PREDICTION_MODE_CONNECTION);
        boolean reactionMode = job.getPredictionMode().equals(Parameter.OPTION_PREDICTION_MODE_REACTION);
        boolean refOrganism1 = job.getOrganism1Option().equals(Parameter.OPTION_ORGANISM_OPTION_REFERENCE);
        boolean refOrganism2 = job.getOrganism2Option().equals(Parameter.OPTION_ORGANISM_OPTION_REFERENCE);
        boolean allButOneComparison = job.getAnalysis().equals(Parameter.OPTION_ANALYSIS_COMPARATIVE) & job.getAnalysisType().equals(Parameter.OPTION_ANALYSIS_TYPE_ALL_BUT_ONE);
        boolean neighbourhoodBuilding1 = job.getAnalysisMode().equals(Parameter.OPTION_NETWORK_BUILDING_NEIGHBOURHOOD) || job.getPhyloMode().equals(Parameter.OPTION_NETWORK_BUILDING_NEIGHBOURHOOD) || job.getOrganism1Mode().equals(Parameter.OPTION_NETWORK_BUILDING_NEIGHBOURHOOD);
        boolean neighbourhoodBuilding2 = !phyloAnalysis && job.getOrganism2Mode().equals(Parameter.OPTION_NETWORK_BUILDING_NEIGHBOURHOOD);

        if (completeDataset) {
            job.setDataset(null);
//        } else if (curatedDataset) {
//            job.setDatasetOption(Parameter.OPTION_DATASET_OPTION_SELECT);
        }
        if (refOrganism1) {
            job.setOrganism1List(null);
            job.setOrganism1Mode(null);
        }

        if (refOrganism2) {
            job.setOrganism2List(null);
            job.setOrganism2Mode(null);
        }

        if (!comparativeAnalysis) {
            job.setComparisonMode(null);
            job.setOrganism2Option(null);
            job.setOrganism2List(null);
            job.setOrganism2Mode(null);

        } else {
            if (allButOneComparison) {
                job.setOrganism1Mode(null);
                job.setOrganism2Option(null);
                job.setOrganism2List(null);
                job.setOrganism2Mode(null);
            }

        }

        if (!phyloAnalysis) {
            job.setPhylogeny(null);
            if (!job.getAnalysis().equals(Parameter.OPTION_ANALYSIS_PATHWAY)) {
                job.setPhyloMode(null);
            }
        } else {
            job.setOrganism1Option(null);
            job.setOrganism2Option(null);
            job.setOrganism1List(null);
            job.setOrganism2List(null);
            job.setOrganism1Mode(null);
            job.setOrganism2Mode(null);
        }

        if (!pathwayAnalysis) {
            job.setStartMetabolites(null);
            job.setEndMetabolites(null);
            job.setPredictionMode(null);
            job.setConnectionOption(null);
            job.setCutoffLength(null);
            job.setReturnValue(null);

            connectionMode = false;
            reactionMode = false;
        }

        if (!connectionMode) {
            job.setConnectionOption(null);
            job.setConnectionFile(null);
        } else {
            if (!job.getConnectionOption().equals(Parameter.OPTION_CONNECTION_OPTION_FILE)) {
                job.setConnectionFile(null);
            }
        }

//        if (!reactionMode) {
//            // set ignore metabolites and reqd elements files to null
//            job.setIgnoreMetabolitesFile(null);
//            job.setRequiredElementsFile(null);
//        }

        if (!neighbourhoodBuilding1) {
            job.setCutoffNeighbourhood1(null);
            job.setIgnoreMetabolitesNetworkBuilding1File(null);
        }

        if (!neighbourhoodBuilding2) {
            job.setCutoffNeighbourhood2(null);
            job.setIgnoreMetabolitesNetworkBuilding2File(null);
        }
        
        // return updated job object
        return job;
    }

    public Option[] getOptionArray(String[][] strArray, boolean includeIdInDesc) {
        // Initialize
        Option[] optArray = new Option[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            optArray[i] = new Option(strArray[i][0], strArray[i][1] + (includeIdInDesc ? " [" + strArray[i][0] + "]" : ""));
        }

        return optArray;
    }

    public RahnumaJob createJob(SessionBean1 sb) {

        RahnumaJob job = new RahnumaJob();

        // Copy the fields
        job.setJobName(sb.getApplicationBean1().getJobNameSuffix() + sb.getJobName());
        job.setEmail(sb.getEmail());
        job.setIpAddress(sb.getIPAddress());
        job.setJobDateTime(Utilities.toString(sb.getJobDateTime()));
        job.setJobDateTimeInternal((double) sb.getJobDateTime().getTime());
        job.setJobStatus(Parameter.JOB_OPEN);
        job.setDatasetOption(sb.getSelectedOptionDataset());
        job.setDataset(sb.getSelectedOptionDataset().equals(Parameter.OPTION_DATASET_OPTION_CURATED) ? Utilities.extractColumn(sb.getDatabase().getCuratedKEGGPathways(new String[]{}),0) : sb.getSelectedDataset());
        job.setAnalysis(sb.getSelectedAnalysis());
        job.setAnalysisType(sb.getSelectedAnalysisType());
        job.setAnalysisMode(sb.getSelectedAnalysisMode());
        job.setComparisonMode(sb.getSelectedComparisonMode());
        job.setPhyloMode(sb.getSelectedPhylogeneticMode());
        job.setOutputType(sb.getSelectedOutputType());
        job.setOutputFormat(sb.getSelectedOutputFormat());
        job.setOrganism1Option(sb.getSelectedOptionOrganism1());
        job.setOrganism1List(sb.getSelectedOrganisms1());
        job.setOrganism1Mode(sb.getSelectedOrganism1Mode());
        job.setOrganism2Option(sb.getSelectedOptionOrganism2());
        job.setOrganism2List(sb.getSelectedOrganisms2());
        job.setOrganism2Mode(sb.getSelectedOrganism2Mode());
        job.setPhylogeny(PhyloTree.formatPhylogeny(sb.getPhylogeny()));
        job.setStartMetabolites(sb.getSelectedStartMetabolites());
        job.setEndMetabolites(sb.getSelectedEndMetabolites());
        job.setPredictionMode(sb.getSelectedPathwayPredictionMode());
        job.setConnectionOption(sb.getSelectedConnectionOption());
        job.setConnectionFile(sb.getConnectionFile() == null ? null : sb.getConnectionFile());
        job.setIgnoreMetabolitesFile(sb.getIgnoreMetabolitesFile() == null ? null : sb.getIgnoreMetabolitesFile());
        job.setRequiredElementsFile(sb.getRequiredElementsFile() == null ? null : sb.getRequiredElementsFile());
        job.setIgnoreMetabolitesNetworkBuilding1File(sb.getIgnoreMetabolitesNetworkBuilding1File() == null ? null : sb.getIgnoreMetabolitesNetworkBuilding1File());
        job.setIgnoreMetabolitesNetworkBuilding2File(sb.getIgnoreMetabolitesNetworkBuilding2File() == null ? null : sb.getIgnoreMetabolitesNetworkBuilding2File());
        job.setCutoffLength(sb.getCutoffLength());
        job.setCutoffNeighbourhood1(sb.getCutoffNeighbourhood1());
        job.setCutoffNeighbourhood2(sb.getCutoffNeighbourhood2());
        job.setReturnValue(sb.getSelectedReturnValue());

        return job;
    }

    static private String validatePhylogeny(String phylogeny, ArrayList organisms) {

        int posComma;

        // remove any white space
        phylogeny = phylogeny.trim();

        if (phylogeny.isEmpty()) {
            return null;
        }
        // Are we at a leaf? ( no paranthesis )
        if (phylogeny.charAt(0) != '(' && phylogeny.charAt(phylogeny.length() - 1) != ')') {

            if (phylogeny.indexOf(",") >= 0) // a extra comma is present
                return "Syntax Error: Unexpected comma. Phylogeny is not dichotomous";
            else if (!organisms.contains(new Organism(phylogeny)))
                return "Invalid organism code: " + phylogeny;
             else
                return null;
        } else if (phylogeny.charAt(0) == '(' && phylogeny.charAt(phylogeny.length() - 1) == ')') {

            phylogeny = phylogeny.substring(1, phylogeny.length() - 1);

            if ((posComma = findRoot(phylogeny)) > 0) {
                String result = validatePhylogeny(phylogeny.substring(0, posComma), organisms);
                if (result == null) // no error was found.. move ahead
                    return validatePhylogeny(phylogeny.substring(posComma + 1), organisms);
                else // there was an error. report the error
                    return result;
            } else // invalid format
                return "Syntax Error: Comma Expected. Phylogeny is not dichotomous";
        } else // invalid format
            return "Syntax Error: Unbalanced paranthesis";

    }

    static private int findRoot(String phylogeny) {

        int pos = 0;
        int paranCount = 0;
        while (pos < phylogeny.length()) {
            if (phylogeny.charAt(pos) == '(') {
                paranCount++;
            } else if (phylogeny.charAt(pos) == ')') {
                paranCount--;
            } else if (phylogeny.charAt(pos) == ',' && paranCount == 0) {
                break;
            }
            pos++;
        }

        if (pos >= phylogeny.length()) {
            pos = 0;
        }

        return pos;
    }

    public boolean validateUser(String userId, String password) {
        if (userId.equals("rahnumatest") && password.equals("qwert123")) {
            return true;
        } else {
            return false;
        }
    }
       
    public HashMap getHelpTexts(SessionBean1 sb) {
        String[][] texts = sb.getDatabase().getHelpTexts();
        
        HashMap helpTexts = new HashMap(texts.length);
        for (int i = 0; i < texts.length; i++) {
            String[] strings = texts[i];

            helpTexts.put(strings[0], strings[1]);
        }

        return helpTexts;
    }
    
    public void setHelpTextsMainPage(SessionBean1 sb) {
        // job name
        sb.setHelpJobName((String)sb.getHelpTexts().get(Parameter.HELP_JOBNAME));
        // email
        sb.setHelpEmail((String)sb.getHelpTexts().get(Parameter.HELP_EMAIL));
        // dataset
        sb.setHelpDataset((String)sb.getHelpTexts().get(Parameter.HELP_KEGG_PATHWAYS));
        // analysis
        sb.setHelpAnalysis((String)sb.getHelpTexts().get(Parameter.HELP_ANALYSIS));
        // output type
        sb.setHelpOutputType((String)sb.getHelpTexts().get(Parameter.HELP_OUTPUT_TYPE));
        // output format
        sb.setHelpOutputFormat((String)sb.getHelpTexts().get(Parameter.HELP_OUTPUT_FORMAT));
    }

    public void setHelpTextsParametersPage(SessionBean1 sb) {
        // organism
        sb.setHelpOrganism((String)sb.getHelpTexts().get(Parameter.HELP_ORGANISM));
        // organism mode
        sb.setHelpOrganismMode((String)sb.getHelpTexts().get(Parameter.HELP_ORGANISM_MODE));
        // phylogeny
        sb.setHelpPhylogeny((String)sb.getHelpTexts().get(Parameter.HELP_PHYLOGENY));
        // neighbourhood cutoff
        sb.setHelpNeighbourhoodCutoff((String)sb.getHelpTexts().get(Parameter.HELP_NEIGHBOURHOOD_CUTOFF));
        // neighbourhood optional constraint
        sb.setHelpNeighbourhoodOptionalConstraint((String)sb.getHelpTexts().get(Parameter.HELP_NEIGHBOURHOOD_OPTIONAL_CONSTRAINT));
        // start metabolites
        sb.setHelpStartMetabolites((String)sb.getHelpTexts().get(Parameter.HELP_START_METABOLITES));
        // end metabolites
        sb.setHelpEndMetabolites((String)sb.getHelpTexts().get(Parameter.HELP_END_METABOLITES));
        // pathway prediction mdoe
        sb.setHelpPathwayPredictionMode((String)sb.getHelpTexts().get(Parameter.HELP_PATHWAY_PREDICTION_MODE));
        // connection option
        sb.setHelpConnectionOption((String)sb.getHelpTexts().get(Parameter.HELP_CONNECTION_OPTION));
        // optional constraints
        sb.setHelpOptionalConstraints((String)sb.getHelpTexts().get(Parameter.HELP_OPTIONAL_CONSTRAINTS));
        // pathway cutoff
        sb.setHelpPathwayCutoff((String)sb.getHelpTexts().get(Parameter.HELP_PATHWAY_CUTOFF));
        // return value
        sb.setHelpReturnValue((String)sb.getHelpTexts().get(Parameter.HELP_RETURN_VALUE));
    }    
    
    private boolean allCuratedPathways(SessionBean1 sb, String[] keggPathways){
        if (keggPathways.length == 0)
            return false;
        // get the list of curated pathways
        String[][] curatedPathways = sb.getDatabase().getCuratedKEGGPathways(new String[]{});
        // build a hash set for searching
        HashSet hsCuratedPathways = new HashSet(curatedPathways.length);
        for (int i = 0; i < curatedPathways.length; i++) {
            hsCuratedPathways.add(curatedPathways[i][0]);
        }
        // check if all the given pathways are curated
        for (int i = 0; i < keggPathways.length; i++) {
            if (!hsCuratedPathways.contains(keggPathways[i]))
                    return false;
        }
        return true;
    }
    
    public String getDefaultIgnoreMetaboltiesList(SessionBean1 sb) {
        String[][] strArray = Utilities.readList2(sb.getSessionParameters().getDefaultIgnoreMetabolitesFilename(), false);
        return Utilities.toString(strArray, "\t");
    }
}
