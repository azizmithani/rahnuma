/*
 * SessionBean1.java
 *
 * Created on 29-Jan-2008, 18:07:03
 */
package rahnumaweb;

import com.sun.rave.web.ui.appbase.AbstractSessionBean;
import com.sun.webui.jsf.model.Option;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.faces.FacesException;
import rahnumadatabase.Database;
import rahnumautilities.Parameter;
import rahnumautilities.Utilities;

/**
 * <p>Session scope data bean for your application.  Create properties
 *  here to represent cached data that should be made available across
 *  multiple HTTP requests for an individual user.</p>
 *
 * <p>An instance of this class will be created for you automatically,
 * the first time your application evaluates a value binding expression
 * or method binding expression that references a managed bean using
 * this class.</p>
 *
 * @author mithani
 */
public class SessionBean1 extends AbstractSessionBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    // </editor-fold>
    // connection parameters
    static public String DB_URL;
    static public String DB_NAME;
    static public String DB_USER;
    static public String DB_PASSWORD;
    static public String DB_DRIVER;
    private Parameter sessionParameters = null;

    /**
     * <p>Construct a new session data bean instance.</p>
     */
    public SessionBean1() {
        loadConnectionParameters();
        database = new Database(DB_URL, DB_NAME, DB_USER, DB_PASSWORD, DB_DRIVER);
        if (database.getConnection() != null)
            readSessionParameters(database);
        else
            setSessionParameters(null);

        if (getSessionParameters() != null) {
            // open log file
            String logDir = getSessionParameters().getWebLogDir();
            String logFilename = getSessionParameters().getWebLogFilename();
            getSessionParameters().setOutLogs(Utilities.openLogFile(logDir, logFilename));

            // read the db udpate date
            DateFormat dateFormat = new SimpleDateFormat("dd MMMMM yyyy");
            DBUpdateDate = dateFormat.format(new Date(database.getLastDBUpdateDateTime()));
        } else {
            DBUpdateDate = "";
            return;
        }

        WebController controller = new WebController();

        // help texts
        helpTexts = controller.getHelpTexts(this);
        
        // default ignore metabolties
        defaultIgnoreMetabolitesList = controller.getDefaultIgnoreMetaboltiesList(this);
        useDefaultIgnoreMetabolites = false;
        
        // Initialize property values
        // Analysis
        analysis = controller.getAnalyses();

        // set the initial analysis
        this.setSelectedAnalysis(analysis[0].getValue().toString());

        // set other analysis options
        controller.refreshAnalysisOptions(this);

        // Output Parameters
        // Output Type
        outputTypes = controller.getOutputTypes();
        // Output Format
        outputFormats = controller.getOutputFormats();

        // Set the flag to false for main & parameter page data as we havent downloaded them yet
        mainPageDataDownloaded = false;
        parameterPageDataDownloaded = false;

        // Initialise the main page
        controller.getMainPageData(this);
        controller.initialiseMainPage(this);

        validLogin = false;

    }

    /**
     * <p>This method is called when this bean is initially added to
     * session scope.  Typically, this occurs as a result of evaluating
     * a value binding or method binding expression, which utilizes the
     * managed bean facility to instantiate this bean and store it into
     * session scope.</p>
     * 
     * <p>You may customize this method to initialize and cache data values
     * or resources that are required for the lifetime of a particular
     * user session.</p>
     */
    @Override
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here

        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("SessionBean1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }

    // </editor-fold>
    // Perform application initialization that must complete
    // *after* managed components are initialized
    // TODO - add your own initialization code here
    }

    /**
     * <p>This method is called when the session containing it is about to be
     * passivated.  Typically, this occurs in a distributed servlet container
     * when the session is about to be transferred to a different
     * container instance, after which the <code>activate()</code> method
     * will be called to indicate that the transfer is complete.</p>
     * 
     * <p>You may customize this method to release references to session data
     * or resources that can not be serialized with the session itself.</p>
     */
    @Override
    public void passivate() {
    }

    /**
     * <p>This method is called when the session containing it was
     * reactivated.</p>
     * 
     * <p>You may customize this method to reacquire references to session
     * data or resources that could not be serialized with the
     * session itself.</p>
     */
    @Override
    public void activate() {
    }

    /**
     * <p>This method is called when this bean is removed from
     * session scope.  Typically, this occurs as a result of
     * the session timing out or being terminated by the application.</p>
     * 
     * <p>You may customize this method to clean up resources allocated
     * during the execution of the <code>init()</code> method, or
     * at any later time during the lifetime of the application.</p>
     */
    @Override
    public void destroy() {
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }
    private Database database;
    private boolean mainPageDataDownloaded;
    private boolean parameterPageDataDownloaded;
    private String jobName;
    private String email;
    private Option[] datasetOptions;
    private Option[] datasetSubset;
    private Option[] dataset;
    private Option[] analysis;
    private Option[] analysisType;
    private Option[] analysisMode;
    private Option[] comparisonMode;
    private Option[] phylogeneticMode;
    private Option[] outputTypes;
    private Option[] outputFormats;
    private Option[] organism1Options;
    private Option[] organism2Options;
    private Option[] organism1Set;
    private Option[] organism2Set;
    private Option[] organismList1;
    private Option[] organismList2;
    private Option[] organismModes;
    private Option[] startMetaboliteSet;
    private Option[] endMetaboliteSet;
    private Option[] startMetabolitesList;
    private Option[] endMetabolitesList;
    private Option[] connectionOptions;
    private Option[] pathwayPredictionModes;
    private Option[] returnValues;
    private String selectedOptionDataset;
    private String selectedDatasetSubset;
    private String[] selectedDatasets;
    private String selectedAnalysis;
    private String selectedAnalysisType;
    private String selectedAnalysisMode;
    private String selectedComparisonMode;
    private String selectedPhylogeneticMode;
    private String selectedOutputType;
    private String selectedOutputFormat;
    private String selectedOptionOrganism1;
    private String selectedOptionOrganism2;
    private String selectedOrganism1Set;
    private String selectedOrganism2Set;
    private String selectedOrganism1Mode;
    private String selectedOrganism2Mode;
    private String selectedStartMetaboliteSet;
    private String selectedEndMetaboliteSet;
    private String selectedConnectionOption;
    private String selectedPathwayPredictionMode;
    private String selectedReturnValue;
    private String[] selectedOrganisms1;
    private String[] selectedOrganisms2;
    private String[] selectedStartMetabolites;
    private String[] selectedEndMetabolites;
    private Double cutoffNeighbourhood1;
    private Double cutoffNeighbourhood2;
    private Integer cutoffLength;
    private String phylogeny;
//    private String connectionFile;
//    private String ignoreMetabolitesFile;
//    private String requiredElementsFile;
    private String labelOrganism1;
    private String IPAddress;
    private Date jobDateTime;
    private String ignoreMetabolitesNetworkBuilding1File;
    private String ignoreMetabolitesNetworkBuilding2File;
    private String ignoreMetabolitesFile;
    private String connectionFile;
    private String requiredElementsFile;
    private String DBUpdateDate;
    private boolean useDefaultIgnoreMetabolites;
    private String defaultIgnoreMetabolitesList;
    
    public Parameter getSessionParameters() {
        return sessionParameters;
    }

    public void setSessionParameters(Parameter sessionParameters) {
        this.sessionParameters = sessionParameters;
    }

    public boolean readSessionParameters(Database database) {

        boolean retValue = database.readApplicationParameters();
        this.sessionParameters = database.getApplicationParameters();

        return retValue;
    }

    public Option[] getDataset() {
        return dataset;
    }

    public void setDataset(Option[] dataset) {
        this.dataset = dataset;
    }

    public Option[] getDatasetOptions() {
        return datasetOptions;
    }

    public void setDatasetOptions(Option[] datasetOptions) {
        this.datasetOptions = datasetOptions;
    }

    public Option[] getDatasetSubset() {
        return datasetSubset;
    }

    public void setDatasetSubset(Option[] datasetSubset) {
        this.datasetSubset = datasetSubset;
    }

    public Option[] getAnalysis() {
        return analysis;
    }

    public void setAnalysis(Option[] analysis) {
        this.analysis = analysis;
    }

    public Option[] getAnalysisMode() {
        return analysisMode;
    }

    public void setAnalysisMode(Option[] analysisMode) {
        this.analysisMode = analysisMode;
    }

    public Option[] getAnalysisType() {
        return analysisType;
    }

    public void setAnalysisType(Option[] analysisType) {
        this.analysisType = analysisType;
    }

    public Option[] getComparisonMode() {
        return comparisonMode;
    }

    public void setComparisonMode(Option[] comparisonMode) {
        this.comparisonMode = comparisonMode;
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Option[] getOutputFormats() {
        return outputFormats;
    }

    public void setOutputFormats(Option[] outputFormats) {
        this.outputFormats = outputFormats;
    }

    public Option[] getOutputTypes() {
        return outputTypes;
    }

    public void setOutputTypes(Option[] outputTypes) {
        this.outputTypes = outputTypes;
    }

    public boolean isMainPageDataDownloaded() {
        return mainPageDataDownloaded;
    }

    public void setMainPageDataDownloaded(boolean mainPageDataDownloaded) {
        this.mainPageDataDownloaded = mainPageDataDownloaded;
    }

    public boolean isParameterPageDataDownloaded() {
        return parameterPageDataDownloaded;
    }

    public void setParameterPageDataDownloaded(boolean parameterPageDataDownloaded) {
        this.parameterPageDataDownloaded = parameterPageDataDownloaded;
    }

    public Option[] getPhylogeneticMode() {
        return phylogeneticMode;
    }

    public void setPhylogeneticMode(Option[] phylogeneticMode) {
        this.phylogeneticMode = phylogeneticMode;
    }

    public String getSelectedDatasetSubset() {
        return selectedDatasetSubset;
    }

    public void setSelectedDatasetSubset(String selectedDatasetSubset) {
        this.selectedDatasetSubset = selectedDatasetSubset;
    }

    public String[] getSelectedDataset() {
        return selectedDatasets;
    }

    public void setSelectedDataset(String[] selectedDataset) {
        this.selectedDatasets = selectedDataset;
    }

    public String getSelectedOptionDataset() {
        return selectedOptionDataset;
    }

    public void setSelectedOptionDataset(String selectedOptionDataset) {
        this.selectedOptionDataset = selectedOptionDataset;
    }

    public String getSelectedAnalysis() {
        return selectedAnalysis;
    }

    public void setSelectedAnalysis(String selectedAnalysis) {
        this.selectedAnalysis = selectedAnalysis;
    }

    public String getSelectedAnalysisMode() {
        return selectedAnalysisMode;
    }

    public void setSelectedAnalysisMode(String selectedAnalysisMode) {
        this.selectedAnalysisMode = selectedAnalysisMode;
    }

    public String getSelectedAnalysisType() {
        return selectedAnalysisType;
    }

    public void setSelectedAnalysisType(String selectedAnalysisType) {
        this.selectedAnalysisType = selectedAnalysisType;
    }

    public String getSelectedComparisonMode() {
        return selectedComparisonMode;
    }

    public void setSelectedComparisonMode(String selectedComparisonMode) {
        this.selectedComparisonMode = selectedComparisonMode;
    }

    public String getSelectedOutputFormat() {
        return selectedOutputFormat;
    }

    public void setSelectedOutputFormat(String selectedOutputFormat) {
        this.selectedOutputFormat = selectedOutputFormat;
    }

    public String getSelectedOutputType() {
        return selectedOutputType;
    }

    public void setSelectedOutputType(String selectedOutputType) {
        this.selectedOutputType = selectedOutputType;
    }

    public String getSelectedPhylogeneticMode() {
        return selectedPhylogeneticMode;
    }

    public void setSelectedPhylogeneticMode(String selectedPhylogeneticMode) {
        this.selectedPhylogeneticMode = selectedPhylogeneticMode;
    }

    public String getIPAddress() {
        return IPAddress;
    }

    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
    }

    public String getConnectionFile() {
        return connectionFile;
    }

    public void setConnectionFile(String connectionFile) {
        this.connectionFile = connectionFile;
    }

    public Option[] getConnectionOptions() {
        return connectionOptions;
    }

    public void setConnectionOptions(Option[] connectionOptions) {
        this.connectionOptions = connectionOptions;
    }

    public Integer getCutoffLength() {
        return cutoffLength;
    }

    public void setCutoffLength(Integer cutoffLength) {
        this.cutoffLength = cutoffLength;
    }

    public Option[] getEndMetaboliteSet() {
        return endMetaboliteSet;
    }

    public void setEndMetaboliteSet(Option[] endMetaboliteSet) {
        this.endMetaboliteSet = endMetaboliteSet;
    }

    public Option[] getEndMetabolitesList() {
        return endMetabolitesList;
    }

    public void setEndMetabolitesList(Option[] endMetabolitesList) {
        this.endMetabolitesList = endMetabolitesList;
    }

    public String getIgnoreMetabolitesFile() {
        return ignoreMetabolitesFile;
    }

    public void setIgnoreMetabolitesFile(String ignoreMetabolitesFile) {
        this.ignoreMetabolitesFile = ignoreMetabolitesFile;
    }

    public Date getJobDateTime() {
        return jobDateTime;
    }

    public void setJobDateTime(Date jobDateTime) {
        this.jobDateTime = jobDateTime;
    }

    public String getLabelOrganism1() {
        return labelOrganism1;
    }

    public void setLabelOrganism1(String labelOrganism1) {
        this.labelOrganism1 = labelOrganism1;
    }

    public Option[] getOrganism1Set() {
        return organism1Set;
    }

    public void setOrganism1Set(Option[] organism1Set) {
        this.organism1Set = organism1Set;
    }

    public Option[] getOrganism2Set() {
        return organism2Set;
    }

    public void setOrganism2Set(Option[] organism2Set) {
        this.organism2Set = organism2Set;
    }

    public Option[] getOrganismList1() {
        return organismList1;
    }

    public void setOrganismList1(Option[] organismList1) {
        this.organismList1 = organismList1;
    }

    public Option[] getOrganismList2() {
        return organismList2;
    }

    public void setOrganismList2(Option[] organismList2) {
        this.organismList2 = organismList2;
    }

    public Option[] getOrganismModes() {
        return organismModes;
    }

    public void setOrganismModes(Option[] organismModes) {
        this.organismModes = organismModes;
    }

    public Option[] getPathwayPredictionModes() {
        return pathwayPredictionModes;
    }

    public void setPathwayPredictionModes(Option[] pathwayPredictionModes) {
        this.pathwayPredictionModes = pathwayPredictionModes;
    }

    public String getPhylogeny() {
        return phylogeny;
    }

    public void setPhylogeny(String phylogeny) {
        this.phylogeny = phylogeny;
    }

    public String getRequiredElementsFile() {
        return requiredElementsFile;
    }

    public void setRequiredElementsFile(String requiredElementsFile) {
        this.requiredElementsFile = requiredElementsFile;
    }

    public Option[] getReturnValues() {
        return returnValues;
    }

    public void setReturnValues(Option[] returnValues) {
        this.returnValues = returnValues;
    }

    public String getSelectedConnectionOption() {
        return selectedConnectionOption;
    }

    public void setSelectedConnectionOption(String selectedConnectionOption) {
        this.selectedConnectionOption = selectedConnectionOption;
    }

    public String getSelectedEndMetaboliteSet() {
        return selectedEndMetaboliteSet;
    }

    public void setSelectedEndMetaboliteSet(String selectedEndMetaboliteSet) {
        this.selectedEndMetaboliteSet = selectedEndMetaboliteSet;
    }

    public String[] getSelectedEndMetabolites() {
        return selectedEndMetabolites;
    }

    public void setSelectedEndMetabolites(String[] selectedEndMetabolites) {
        this.selectedEndMetabolites = selectedEndMetabolites;
    }

    public String getSelectedOptionOrganism1() {
        return selectedOptionOrganism1;
    }

    public void setSelectedOptionOrganism1(String selectedOptionOrganism1) {
        this.selectedOptionOrganism1 = selectedOptionOrganism1;
    }

    public String getSelectedOptionOrganism2() {
        return selectedOptionOrganism2;
    }

    public void setSelectedOptionOrganism2(String selectedOptionOrganism2) {
        this.selectedOptionOrganism2 = selectedOptionOrganism2;
    }

    public String getSelectedOrganism1Mode() {
        return selectedOrganism1Mode;
    }

    public void setSelectedOrganism1Mode(String selectedOrganism1Mode) {
        this.selectedOrganism1Mode = selectedOrganism1Mode;
    }

    public String getSelectedOrganism1Set() {
        return selectedOrganism1Set;
    }

    public void setSelectedOrganism1Set(String selectedOrganism1Set) {
        this.selectedOrganism1Set = selectedOrganism1Set;
    }

    public String getSelectedOrganism2Mode() {
        return selectedOrganism2Mode;
    }

    public void setSelectedOrganism2Mode(String selectedOrganism2Mode) {
        this.selectedOrganism2Mode = selectedOrganism2Mode;
    }

    public String getSelectedOrganism2Set() {
        return selectedOrganism2Set;
    }

    public void setSelectedOrganism2Set(String selectedOrganism2Set) {
        this.selectedOrganism2Set = selectedOrganism2Set;
    }

    public String[] getSelectedOrganisms1() {
        return selectedOrganisms1;
    }

    public void setSelectedOrganisms1(String[] selectedOrganisms1) {
        this.selectedOrganisms1 = selectedOrganisms1;
    }

    public String[] getSelectedOrganisms2() {
        return selectedOrganisms2;
    }

    public void setSelectedOrganisms2(String[] selectedOrganisms2) {
        this.selectedOrganisms2 = selectedOrganisms2;
    }

    public String getSelectedPathwayPredictionMode() {
        return selectedPathwayPredictionMode;
    }

    public void setSelectedPathwayPredictionMode(String selectedPathwayPredictionMode) {
        this.selectedPathwayPredictionMode = selectedPathwayPredictionMode;
    }

    public String getSelectedReturnValue() {
        return selectedReturnValue;
    }

    public void setSelectedReturnValue(String selectedReturnValue) {
        this.selectedReturnValue = selectedReturnValue;
    }

    public String getSelectedStartMetaboliteSet() {
        return selectedStartMetaboliteSet;
    }

    public void setSelectedStartMetaboliteSet(String selectedStartMetaboliteSet) {
        this.selectedStartMetaboliteSet = selectedStartMetaboliteSet;
    }

    public String[] getSelectedStartMetabolites() {
        return selectedStartMetabolites;
    }

    public void setSelectedStartMetabolites(String[] selectedStartMetabolites) {
        this.selectedStartMetabolites = selectedStartMetabolites;
    }

    public Option[] getStartMetaboliteSet() {
        return startMetaboliteSet;
    }

    public void setStartMetaboliteSet(Option[] startMetaboliteSet) {
        this.startMetaboliteSet = startMetaboliteSet;
    }

    public Option[] getStartMetabolitesList() {
        return startMetabolitesList;
    }

    public void setStartMetabolitesList(Option[] startMetabolitesList) {
        this.startMetabolitesList = startMetabolitesList;
    }

    public Option[] getOrganism1Options() {
        return organism1Options;
    }

    public void setOrganism1Options(Option[] organism1Options) {
        this.organism1Options = organism1Options;
    }

    public Option[] getOrganism2Options() {
        return organism2Options;
    }

    public void setOrganism2Options(Option[] organism2Options) {
        this.organism2Options = organism2Options;
    }

    public double getCutoffNeighbourhood1() {
        return cutoffNeighbourhood1;
    }

    public void setCutoffNeighbourhood1(double cutoffNeighbourhood1) {
        this.cutoffNeighbourhood1 = cutoffNeighbourhood1;
    }

    public double getCutoffNeighbourhood2() {
        return cutoffNeighbourhood2;
    }

    public void setCutoffNeighbourhood2(double cutoffNeighbourhood2) {
        this.cutoffNeighbourhood2 = cutoffNeighbourhood2;
    }

    public String getIgnoreMetabolitesNetworkBuilding1File() {
        return ignoreMetabolitesNetworkBuilding1File;
    }

    public void setIgnoreMetabolitesNetworkBuilding1File(String ignoreMetabolitesNetworkBuilding1File) {
        this.ignoreMetabolitesNetworkBuilding1File = ignoreMetabolitesNetworkBuilding1File;
    }

    public String getIgnoreMetabolitesNetworkBuilding2File() {
        return ignoreMetabolitesNetworkBuilding2File;
    }

    public void setIgnoreMetabolitesNetworkBuilding2File(String ignoreMetabolitesNetworkBuilding2File) {
        this.ignoreMetabolitesNetworkBuilding2File = ignoreMetabolitesNetworkBuilding2File;
    }
    private boolean validLogin;
    private HashMap helpTexts;

    public boolean isValidLogin() {
        return validLogin;
    }

    public void setValidLogin(boolean validLogin) {
        this.validLogin = validLogin;
    }

    public HashMap getHelpTexts() {
        return helpTexts;
    }

    public void HashMap(HashMap helpTexts) {
        this.helpTexts = helpTexts;
    }
    private String helpJobName;
    private String helpEmail;
    private String helpAnalysis;
    private String helpAnalysisType;
    private String helpAnalysisMode;
    private String helpComparisonMode;
    private String helpNetworkMode;
    private String helpOutputType;
    private String helpOutputFormat;
    private String helpOrganism;
    private String helpOrganismMode;
    private String helpPhylogeny;
    private String helpNeighbourhoodCutoff;
    private String helpNeighbourhoodOptionalConstraint;
    private String helpStartMetabolites;
    private String helpEndMetabolites;
    private String helpPathwayPredictionMode;
    private String helpConnectionOption;
    private String helpOptionalConstraints;
    private String helpPathwayCutoff;
    private String helpReturnValue;
    private String helpDataset;

    public String getHelpJobName() {
        return helpJobName;
    }

    public void setHelpJobName(String helpJobName) {
        this.helpJobName = helpJobName;
    }

    public String getHelpAnalysis() {
        return helpAnalysis;
    }

    public void setHelpAnalysis(String helpAnalysis) {
        this.helpAnalysis = helpAnalysis;
    }

    public String getHelpAnalysisMode() {
        return helpAnalysisMode;
    }

    public void setHelpAnalysisMode(String helpAnalysisMode) {
        this.helpAnalysisMode = helpAnalysisMode;
    }

    public String getHelpAnalysisType() {
        return helpAnalysisType;
    }

    public void setHelpAnalysisType(String helpAnalysisType) {
        this.helpAnalysisType = helpAnalysisType;
    }

    public String getHelpComparisonMode() {
        return helpComparisonMode;
    }

    public void setHelpComparisonMode(String helpComparisonMode) {
        this.helpComparisonMode = helpComparisonMode;
    }

    public String getHelpEmail() {
        return helpEmail;
    }

    public void setHelpEmail(String helpEmail) {
        this.helpEmail = helpEmail;
    }

    public String getHelpNetworkMode() {
        return helpNetworkMode;
    }

    public void setHelpNetworkMode(String helpNetworkMode) {
        this.helpNetworkMode = helpNetworkMode;
    }

    public String getHelpOutputFormat() {
        return helpOutputFormat;
    }

    public void setHelpOutputFormat(String helpOutputFormat) {
        this.helpOutputFormat = helpOutputFormat;
    }

    public String getHelpOutputType() {
        return helpOutputType;
    }

    public void setHelpOutputType(String helpOutputType) {
        this.helpOutputType = helpOutputType;
    }

    public String getHelpConnectionOption() {
        return helpConnectionOption;
    }

    public void setHelpConnectionOption(String helpConnectionOption) {
        this.helpConnectionOption = helpConnectionOption;
    }

    public String getHelpEndMetabolites() {
        return helpEndMetabolites;
    }

    public void setHelpEndMetabolites(String helpEndMetabolites) {
        this.helpEndMetabolites = helpEndMetabolites;
    }

    public String getHelpNeighbourhoodCutoff() {
        return helpNeighbourhoodCutoff;
    }

    public void setHelpNeighbourhoodCutoff(String helpNeighbourhoodCutoff) {
        this.helpNeighbourhoodCutoff = helpNeighbourhoodCutoff;
    }

    public String getHelpNeighbourhoodOptionalConstraint() {
        return helpNeighbourhoodOptionalConstraint;
    }

    public void setHelpNeighbourhoodOptionalConstraint(String helpNeighbourhoodOptionalConstraint) {
        this.helpNeighbourhoodOptionalConstraint = helpNeighbourhoodOptionalConstraint;
    }

    public String getHelpOptionalConstraints() {
        return helpOptionalConstraints;
    }

    public void setHelpOptionalConstraints(String helpOptionalConstraints) {
        this.helpOptionalConstraints = helpOptionalConstraints;
    }

    public String getHelpOrganism() {
        return helpOrganism;
    }

    public void setHelpOrganism(String helpOrganism) {
        this.helpOrganism = helpOrganism;
    }

    public String getHelpOrganismMode() {
        return helpOrganismMode;
    }

    public void setHelpOrganismMode(String helpOrganismMode) {
        this.helpOrganismMode = helpOrganismMode;
    }

    public String getHelpPathwayCutoff() {
        return helpPathwayCutoff;
    }

    public void setHelpPathwayCutoff(String helpPathwayCutoff) {
        this.helpPathwayCutoff = helpPathwayCutoff;
    }

    public String getHelpPathwayPredictionMode() {
        return helpPathwayPredictionMode;
    }

    public void setHelpPathwayPredictionMode(String helpPathwayPredictionMode) {
        this.helpPathwayPredictionMode = helpPathwayPredictionMode;
    }

    public String getHelpPhylogeny() {
        return helpPhylogeny;
    }

    public void setHelpPhylogeny(String helpPhylogeny) {
        this.helpPhylogeny = helpPhylogeny;
    }

    public String getHelpReturnValue() {
        return helpReturnValue;
    }

    public void setHelpReturnValue(String helpReturnValue) {
        this.helpReturnValue = helpReturnValue;
    }

    public String getHelpStartMetabolites() {
        return helpStartMetabolites;
    }

    public void setHelpStartMetabolites(String helpStartMetabolites) {
        this.helpStartMetabolites = helpStartMetabolites;
    }

    public String getHelpDataset() {
        return helpDataset;
    }

    public void setHelpDataset(String helpDataset) {
        this.helpDataset = helpDataset;
    }

    public String getDBUpdateDate() {
        return DBUpdateDate;
    }

    public void setDBUpdateDate(String DBUpdateDate) {
        this.DBUpdateDate = DBUpdateDate;
    }

    public boolean isUseDefaultIgnoreMetabolites() {
        return useDefaultIgnoreMetabolites;
    }

    public void setUseDefaultIgnoreMetabolites(boolean useDefaultIgnoreMetabolites) {
        this.useDefaultIgnoreMetabolites = useDefaultIgnoreMetabolites;
    }

    public String getDefaultIgnoreMetabolitesList() {
        return defaultIgnoreMetabolitesList;
    }

    private void loadConnectionParameters() {
        //String dirName = "E:/MyData/Oxford/DPhil/Code/Java/Rahnuma";
        String dirName = "/data/blacktern/rahnuma/live";
        //String dirName = "/data/blacktern/rahnuma/test";
        String[][] connection_parameters = Utilities.readList2(dirName, "rahnumaweb.conn", false);

        if (connection_parameters == null || connection_parameters.length == 0)
            return;
        else {
            for (int i = 0; i < connection_parameters.length; i++) {
                if (connection_parameters[i][0].equals("DB_URL"))
                    DB_URL = connection_parameters[i][1];
                else if (connection_parameters[i][0].equals("DB_NAME"))
                    DB_NAME = connection_parameters[i][1];
                else if (connection_parameters[i][0].equals("DB_USER"))
                    DB_USER = connection_parameters[i][1];
                else if (connection_parameters[i][0].equals("DB_PASSWORD"))
                    DB_PASSWORD = connection_parameters[i][1];
                else if (connection_parameters[i][0].equals("DB_DRIVER"))
                    DB_DRIVER = connection_parameters[i][1];

            }
        }

    }
}
