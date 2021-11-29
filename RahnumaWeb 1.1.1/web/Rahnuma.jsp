<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Rahnuma
    Created on : 29-Jan-2008, 21:20:35
    Author     : mithani
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{Rahnuma.page1}" id="page1">
            <webuijsf:html binding="#{Rahnuma.html1}" id="html1">
                <webuijsf:head binding="#{Rahnuma.head1}" id="head1" title="Rahnuma: Pathway Analysis and Network Comparison Tool">
                    <webuijsf:link binding="#{Rahnuma.link1}" id="link1" url="/resources/stylesheet.css"/>
                    <script type="text/javascript">
                        function refreshForDataset(component) {
                            document.getElementById('form1:loDataset:loKEGGPathway:loSelectDataset:lblDatasetSubet').refresh(component + '1');
                            document.getElementById('form1:loDataset:loKEGGPathway:loSelectDataset:drpDatasetSubet').refresh(component + '1a');
                            document.getElementById('form1:loDataset:loKEGGPathway:loSelectDataset:stxtDataset').refresh(component + '1d');
                            
                            return false;
                        }
                        function refreshAnalysisOptions(component) {
                            document.getElementById('form1:loJobSpecification:loAnalysisOptions:loAnalysisType:rbgAnalysisType').refresh(component + '1'); 
                            document.getElementById('form1:loJobSpecification:loAnalysisOptions:loAnalysisType:hlAnalysisType').refresh(component + '1a'); 
                            
                            document.getElementById('form1:loJobSpecification:loAnalysisOptions:loAnalysisMode:rbgAnalysisMode').refresh(component + '2'); 
                            document.getElementById('form1:loJobSpecification:loAnalysisOptions:loAnalysisMode:lblAnalysisMode').refresh(component + '2a'); 
                            document.getElementById('form1:loJobSpecification:loAnalysisOptions:loAnalysisMode:hlAnalysisMode').refresh(component + '2b'); 

                            document.getElementById('form1:loJobSpecification:loAnalysisOptions:loComparisonMode:rbgComparisonMode').refresh(component + '3');
                            document.getElementById('form1:loJobSpecification:loAnalysisOptions:loComparisonMode:lblComparisonMode').refresh(component + '3a');
                            document.getElementById('form1:loJobSpecification:loAnalysisOptions:loComparisonMode:hlComparisonMode').refresh(component + '3b');
                            
                            document.getElementById('form1:loJobSpecification:loAnalysisOptions:loPhyloMode:rbgPhyloMode').refresh(component + '4');
                            document.getElementById('form1:loJobSpecification:loAnalysisOptions:loPhyloMode:lblPhyloMode').refresh(component + '4a');
                            document.getElementById('form1:loJobSpecification:loAnalysisOptions:loPhyloMode:hlPhyloMode').refresh(component + '4b');
                            return false;
                        }
                        function refreshForAnalysisType(component) {
                            document.getElementById('form1:loJobSpecification:loAnalysisOptions:loAnalysisMode:rbgAnalysisMode').refresh(component); 
                            document.getElementById('form1:loJobSpecification:loAnalysisOptions:loAnalysisMode:lblAnalysisMode').refresh(component + '1'); 
                            document.getElementById('form1:loJobSpecification:loAnalysisOptions:loAnalysisMode:hlAnalysisMode').refresh(component + '2'); 
                            return false;
                        }
                        function refreshForAnalysisMode(component) {
                            document.getElementById('form1:loJobSpecification:loAnalysisOptions:loPhyloMode:rbgPhyloMode').refresh(component);
                            document.getElementById('form1:loJobSpecification:loAnalysisOptions:loPhyloMode:lblPhyloMode').refresh(component + '1');
                            document.getElementById('form1:loJobSpecification:loAnalysisOptions:loPhyloMode:hlPhyloMode').refresh(component + '2');
                            return false;
                        }
                    </script>
                </webuijsf:head>
                <webuijsf:body binding="#{Rahnuma.body1}" id="body1">
                    <br/>
                    <webuijsf:form binding="#{Rahnuma.frmHeader}" id="frmHeader">
                        <br/>
                        <webuijsf:panelLayout binding="#{Rahnuma.loTitle}" id="loTitle" panelLayout="flow" style="text-align: center; vertical-align: middle; width: 650px">
                            <webuijsf:panelGroup binding="#{Rahnuma.gpTitle}" block="true" id="gpTitle">
                                <webuijsf:image align="bottom" binding="#{Rahnuma.imgTitle}" id="imgTitle" style="margin-right: 5px" url="/resources/title.JPG"/>
                                <webuijsf:button actionExpression="#{Rahnuma.btnHelp_action}" alt="Help" binding="#{Rahnuma.btnHelp}" id="btnHelp"
                                    onClick="window.open(&quot;helpmain.html&quot;);&#xa;return false;"
                                    style="font-size: 12px; margin-bottom: 5px; text-align: center; width: 15mm" text="Help"/>
                                <webuijsf:button actionExpression="#{Rahnuma.btnAbout_action}" alt="About" binding="#{Rahnuma.btnAbout}" id="btnAbout"
                                    onClick="window.open(&quot;about.html&quot;);&#xa;return false;"
                                    style="font-size: 12px; margin-bottom: 5px; text-align: center; width: 15mm" text="About"/>
                            </webuijsf:panelGroup>
                            <webuijsf:panelGroup binding="#{Rahnuma.gpVersion}" block="true" id="gpVersion" style="margin-right: 80px">
                                <webuijsf:staticText binding="#{Rahnuma.stxtVersion}" id="stxtVersion" style="font-size: 12px; font-weight: bold" text="#{ApplicationBean1.version}"/>
                            </webuijsf:panelGroup>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout binding="#{Rahnuma.loPageNo}" id="loPageNo" panelLayout="flow" style="margin-top: 10px; margin-bottom: 20px; text-align: center; width: 600px">
                            <webuijsf:staticText binding="#{Rahnuma.stPageNo}" id="stPageNo"
                                style="color: navy; font-size: 12px; font-weight: bold; height: 20px; margin-right: 30px; text-align: center; width: 206px" text="== Page 1 of 2 =="/>
                        </webuijsf:panelLayout>
                    </webuijsf:form>
                    <webuijsf:form binding="#{Rahnuma.form1}" id="form1">
                        <webuijsf:panelLayout binding="#{Rahnuma.loJobDetail}" id="loJobDetail" panelLayout="flow" style="width: 100%; margin-left: 25px; margin-top: 5px; ">
                            <webuijsf:panelLayout binding="#{Rahnuma.loJobDetailHeading}" id="loJobDetailHeading" panelLayout="flow" style="margin-top: 30px; margin-bottom: 10px; width: 100%">
                                <webuijsf:staticText binding="#{Rahnuma.stxtJobDetail}" id="stxtJobDetail"
                                    style="font-size: 14px; font-weight: bold; text-decoration: underline" text="Job Detail"/>
                            </webuijsf:panelLayout>
                            <webuijsf:panelLayout binding="#{Rahnuma.loJobName}" id="loJobName" panelLayout="flow" style="margin-left: 25px; margin-top: 5px; width: 100%">
                                <webuijsf:panelGroup binding="#{Rahnuma.gpJobName}" block="true" id="gpJobName" style="width: 100%;margin-bottom: 5px">
                                    <webuijsf:label binding="#{Rahnuma.lblJobName}" for="txtJobName" id="lblJobName" style="color: green; font-size: 12px" text="Job Name *"/>
                                    <webuijsf:hyperlink actionExpression="#{Rahnuma.hlJobName_action}" binding="#{Rahnuma.hlJobName}" id="hlJobName"
                                        style="font-size: 12px; font-weight: bold" target="_blank" text="[?]" toolTip="#{SessionBean1.helpJobName}" url="helpmain.html#JobName"/>
                                    <webuijsf:textField binding="#{Rahnuma.txtJobName}" columns="50" id="txtJobName" style="font-size: 12px; margin-left: 5px"
                                        tabIndex="1" text="#{SessionBean1.jobName}"/>
                                </webuijsf:panelGroup>
                                <webuijsf:staticText binding="#{Rahnuma.stxtJobNameErrorMessage}" id="stxtJobNameErrorMessage"
                                    style="color: rgb(204, 0, 0); font-size: 12px; height: 12px; margin-left:95px" text="Please specify a job name."/>
                            </webuijsf:panelLayout>
                            <webuijsf:panelLayout binding="#{Rahnuma.loEmail}" id="loEmail" panelLayout="flow" style="margin-left: 25px; margin-top: 5px; width: 100%">
                                <webuijsf:panelGroup binding="#{Rahnuma.gpEmail}" block="true" id="gpEmail" style="width: 100%;margin-bottom: 5px; margin-top:10px">
                                    <webuijsf:label binding="#{Rahnuma.lblEmail}" for="txtEmail" id="lblEmail" style="color: green; font-size: 12px" text="Email *"/>
                                    <webuijsf:hyperlink actionExpression="#{Rahnuma.hlEmail_action}" binding="#{Rahnuma.hlEmail}" id="hlEmail"
                                        style="font-size: 12px; font-weight: bold" target="_blank" text="[?]" toolTip="#{SessionBean1.helpEmail}" url="helpmain.html#Email"/>
                                    <webuijsf:textField binding="#{Rahnuma.txtEmail}" columns="50" id="txtEmail" style="font-size: 12px; margin-left: 31px"
                                        tabIndex="2" text="#{SessionBean1.email}"/>
                                </webuijsf:panelGroup>
                                <webuijsf:staticText binding="#{Rahnuma.stxtEmailErrorMessage}" id="stxtEmailErrorMessage"
                                    style="color: rgb(204, 0, 0); font-size: 12px; margin-left:95px" text="Please specify a valid email address."/>
                            </webuijsf:panelLayout>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout binding="#{Rahnuma.loDataset}" id="loDataset" panelLayout="flow" style="margin-left: 25px; margin-top: 5px; width: 100%">
                            <webuijsf:panelLayout binding="#{Rahnuma.loDatasetHeading}" id="loDatasetHeading" panelLayout="flow" style="margin-top: 30px; margin-bottom: 10px; width: 100%">
                                <webuijsf:staticText binding="#{Rahnuma.stxtDatasetHeading}" id="stxtDatasetHeading"
                                    style="font-size: 14px; font-weight: bold; text-decoration: underline" text="Dataset"/>
                            </webuijsf:panelLayout>
                            <webuijsf:panelLayout binding="#{Rahnuma.loKEGGPathway}" id="loKEGGPathway" panelLayout="flow" style="margin-left: 25px; margin-top: 5px; width: 100%">
                                <webuijsf:label binding="#{Rahnuma.lblDataset}" id="lblDataset" style="color: green; font-size: 12px" text="Select KEGG Pathways"/>
                                <webuijsf:hyperlink binding="#{Rahnuma.hlDataset}" id="hlDataset" style="font-size: 12px; font-weight: bold" target="_blank"
                                    text="[?]" toolTip="#{SessionBean1.helpDataset}" url="helpmain.html#KEGGPathways"/>
                                <webuijsf:panelLayout binding="#{Rahnuma.loDatasetOptions}" id="loDatasetOptions" panelLayout="flow" style="width: 100%">
                                    <webuijsf:radioButtonGroup binding="#{Rahnuma.rbgDatasetOptions}" id="rbgDatasetOptions"
                                        items="#{SessionBean1.datasetOptions}"
                                        onClick="webui.suntheme.common.timeoutSubmitForm(this.form, 'loDataset:loKEGGPathway:loDatasetOptions:rbgDatasetOptions');"
                                        selected="#{SessionBean1.selectedOptionDataset}" style="font-size: 12px; line-height: 22px;" tabIndex="3" valueChangeListenerExpression="#{Rahnuma.rbgDatasetOptions_processValueChange}"/>
                                </webuijsf:panelLayout>
                                <webuijsf:panelLayout binding="#{Rahnuma.loSelectDataset}" id="loSelectDataset" panelLayout="flow" style="margin-left: 25px;width: 700px">
                                    <webuijsf:label binding="#{Rahnuma.lblDatasetSubset}" id="lblDatasetSubset" style="color: navy; font-size: 12px" text="Show Subset"/>
                                    <webuijsf:dropDown binding="#{Rahnuma.drpDatasetSubset}" id="drpDatasetSubset" items="#{SessionBean1.datasetSubset}"
                                        onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'loDataset:loKEGGPathway:loSelectDataset:drpDatasetSubset');"
                                        selected="#{SessionBean1.selectedDatasetSubset}" tabIndex="4" valueChangeListenerExpression="#{Rahnuma.drpDatasetSubset_processValueChange}"/>
                                    <webuijsf:addRemove availableItemsLabel="Available:" binding="#{Rahnuma.arDataset}" id="arDataset"
                                        items="#{SessionBean1.dataset}" selectAll="true" selected="#{SessionBean1.selectedDataset}"
                                        selectedItemsLabel="Selected:" style="width: 99%" tabIndex="5"/>
                                    <webuijsf:staticText binding="#{Rahnuma.stxtDataset}" id="stxtDataset" style="color: rgb(204, 0, 0); font-size: 12px; margin-bottom:20px; margin-left:5px; width: 100%"/>
                                </webuijsf:panelLayout>
                            </webuijsf:panelLayout>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout binding="#{Rahnuma.loJobSpecification}" id="loJobSpecification" panelLayout="flow" style="margin-left: 25px; margin-top: 5px; width: 100%">
                            <webuijsf:panelLayout binding="#{Rahnuma.loJobSpecificationHeading}" id="loJobSpecificationHeading" panelLayout="flow" style="margin-top: 15px; margin-bottom: 10px; width: 100%">
                                <webuijsf:staticText binding="#{Rahnuma.stxtJobSpecification}" id="stxtJobSpecification"
                                    style="font-size: 14px; font-weight: bold; text-decoration: underline" text="Job Specification"/>
                            </webuijsf:panelLayout>
                            <webuijsf:panelLayout binding="#{Rahnuma.loAnalysis}" id="loAnalysis" panelLayout="flow" style="margin-left: 25px; margin-top: 5px; padding-top: 20px; width: 100%">
                                <webuijsf:label binding="#{Rahnuma.lblAnalysis}" for="rbgAnalysis" id="lblAnalysis" style="color: green; font-size: 12px" text="Analysis"/>
                                <webuijsf:hyperlink actionExpression="#{Rahnuma.hlAnalysis_action}" binding="#{Rahnuma.hlAnalysis}" id="hlAnalysis"
                                    style="font-size: 12px; font-weight: bold" target="_blank" text="[?]" toolTip="#{SessionBean1.helpAnalysis}" url="helpmain.html#Analysis"/>
                                <webuijsf:radioButtonGroup binding="#{Rahnuma.rbgAnalysis}" id="rbgAnalysis" items="#{SessionBean1.analysis}"
                                    onClick="refreshAnalysisOptions('form1:loJobSpecification:loAnalysis:rbgAnalysis');"
                                    selected="#{SessionBean1.selectedAnalysis}" style="font-size: 12px; height: 83px; line-height: 22px;" tabIndex="6" valueChangeListenerExpression="#{Rahnuma.rbgAnalysis_processValueChange}"/>
                            </webuijsf:panelLayout>
                            <webuijsf:panelLayout binding="#{Rahnuma.loAnalysisOptions}" id="loAnalysisOptions" panelLayout="flow" style="margin-left: 25px; padding-top: 20px; width: 100%">
                                <webuijsf:label binding="#{Rahnuma.lblAnalysisOptions}" id="lblAnalysisOptions" style="color: green; font-size: 12px" text="Analysis Options"/>
                                <h:panelGrid binding="#{Rahnuma.gpAnalysisOptions}" columns="2" id="gpAnalysisOptions" style="width: 650px">
                                    <webuijsf:panelLayout binding="#{Rahnuma.loAnalysisType}" id="loAnalysisType" panelLayout="flow" style="margin-left: 25px; margin-top: 10px; width: 400px">
                                        <webuijsf:label binding="#{Rahnuma.lblAnalysisType}" id="lblAnalysisType" style="color: green; font-size: 12px" text="Type"/>
                                        <webuijsf:hyperlink actionExpression="#{Rahnuma.hlAnalysisType_action}" binding="#{Rahnuma.hlAnalysisType}"
                                            id="hlAnalysisType" style="font-size: 12px; font-weight: bold" target="_blank" text="[?]"
                                            toolTip="#{SessionBean1.helpAnalysisType}" url="helpmain.html#AnalysisType"/>
                                        <webuijsf:radioButtonGroup binding="#{Rahnuma.rbgAnalysisType}" id="rbgAnalysisType"
                                            items="#{SessionBean1.analysisType}"
                                            onClick="refreshForAnalysisType('form1:loJobSpecification:loAnalysisOptions:loAnalysisType:rbgAnalysisType')"
                                            selected="#{SessionBean1.selectedAnalysisType}" style="font-size: 12px; line-height: 22px" tabIndex="7" valueChangeListenerExpression="#{Rahnuma.rbgAnalysisType_processValueChange}"/>
                                    </webuijsf:panelLayout>
                                    <webuijsf:panelLayout binding="#{Rahnuma.loAnalysisMode}" id="loAnalysisMode" panelLayout="flow" style="margin-left: 25px; margin-top: 10px; width: 400px">
                                        <webuijsf:label binding="#{Rahnuma.lblAnalysisMode}" id="lblAnalysisMode" style="color: green; font-size: 12px" text="Mode"/>
                                        <webuijsf:hyperlink actionExpression="#{Rahnuma.hlAnalysisMode_action}" binding="#{Rahnuma.hlAnalysisMode}"
                                            id="hlAnalysisMode" style="font-size: 12px; font-weight: bold" target="_blank" text="[?]"
                                            toolTip="#{SessionBean1.helpAnalysisMode}" url="helpmain.html#AnalysisMode"/>
                                        <webuijsf:radioButtonGroup binding="#{Rahnuma.rbgAnalysisMode}" id="rbgAnalysisMode"
                                            items="#{SessionBean1.analysisMode}"
                                            onClick="refreshForAnalysisMode('form1:loJobSpecification:loAnalysisOptions:loAnalysisMode:rbgAnalysisMode')"
                                            selected="#{SessionBean1.selectedAnalysisMode}" style="font-size: 12px; line-height: 22px" tabIndex="8" valueChangeListenerExpression="#{Rahnuma.rbgAnalysisMode_processValueChange}"/>
                                    </webuijsf:panelLayout>
                                    <webuijsf:panelLayout binding="#{Rahnuma.loComparisonMode}" id="loComparisonMode" panelLayout="flow" style="margin-left: 25px; margin-top: 10px; width: 400px">
                                        <webuijsf:label binding="#{Rahnuma.lblComparisonMode}" id="lblComparisonMode" style="color: green; font-size: 12px" text="Comparison"/>
                                        <webuijsf:hyperlink actionExpression="#{Rahnuma.hlComparisonMode_action}" binding="#{Rahnuma.hlComparisonMode}"
                                            id="hlComparisonMode" style="font-size: 12px; font-weight: bold" target="_blank" text="[?]"
                                            toolTip="#{SessionBean1.helpComparisonMode}" url="helpmain.html#ComparisonMode"/>
                                        <webuijsf:radioButtonGroup binding="#{Rahnuma.rbgComparisonMode}" id="rbgComparisonMode"
                                            items="#{SessionBean1.comparisonMode}" selected="#{SessionBean1.selectedComparisonMode}"
                                            style="font-size: 12px; line-height: 22px" tabIndex="9"/>
                                    </webuijsf:panelLayout>
                                    <webuijsf:panelLayout binding="#{Rahnuma.loPhyloMode}" id="loPhyloMode" panelLayout="flow" style="margin-left: 25px; margin-top: 10px; width: 400px">
                                        <webuijsf:label binding="#{Rahnuma.lblPhyloMode}" for="rbgPhyloMode" id="lblPhyloMode"
                                            style="color: green; font-size: 12px" text="Network Mode"/>
                                        <webuijsf:hyperlink actionExpression="#{Rahnuma.hlPhyloMode_action}" binding="#{Rahnuma.hlPhyloMode}" id="hlPhyloMode"
                                            style="font-size: 12px; font-weight: bold" target="_blank" text="[?]" toolTip="#{SessionBean1.helpNetworkMode}" url="helpmain.html#NetworkMode"/>
                                        <webuijsf:radioButtonGroup binding="#{Rahnuma.rbgPhyloMode}" id="rbgPhyloMode" items="#{SessionBean1.phylogeneticMode}"
                                            selected="#{SessionBean1.selectedPhylogeneticMode}" style="font-size: 12px; line-height: 22px" tabIndex="10"/>
                                    </webuijsf:panelLayout>
                                </h:panelGrid>
                            </webuijsf:panelLayout>
                            <webuijsf:panelLayout binding="#{Rahnuma.loOutputOptions}" id="loOutputOptions" panelLayout="flow" style="margin-left: 25px; padding-top: 20px; width: 100%">
                                <webuijsf:label binding="#{Rahnuma.llblOutputOptions}" id="llblOutputOptions" style="color: green; font-size: 12px" text="Output Options"/>
                                <h:panelGrid binding="#{Rahnuma.gpOutputOptions}" columns="2" id="gpOutputOptions" style="width: 650px">
                                    <webuijsf:panelLayout binding="#{Rahnuma.loOutputType}" id="loOutputType" panelLayout="flow" style="margin-left: 25px; margin-top: 10px; width: 400px">
                                        <webuijsf:label binding="#{Rahnuma.lblOutputType}" id="lblOutputType" style="color: green; font-size: 12px" text="Type"/>
                                        <webuijsf:hyperlink actionExpression="#{Rahnuma.hlOutputType_action}" binding="#{Rahnuma.hlOutputType}"
                                            id="hlOutputType" style="font-size: 12px; font-weight: bold" target="_blank" text="[?]"
                                            toolTip="#{SessionBean1.helpOutputType}" url="helpmain.html#OutputType"/>
                                        <webuijsf:radioButtonGroup binding="#{Rahnuma.rbgOutputType}" id="rbgOutputType" items="#{SessionBean1.outputTypes}"
                                            selected="#{SessionBean1.selectedOutputType}" style="font-size: 12px; line-height: 22px" tabIndex="11"/>
                                    </webuijsf:panelLayout>
                                    <webuijsf:panelLayout binding="#{Rahnuma.loOutputFormat}" id="loOutputFormat" panelLayout="flow" style="margin-left: 25px; margin-top: 10px; width: 400px">
                                        <webuijsf:label binding="#{Rahnuma.lblOutputFormat}" id="lblOutputFormat" style="color: green; font-size: 12px" text=" Format"/>
                                        <webuijsf:hyperlink actionExpression="#{Rahnuma.hlOutputFormat_action}" binding="#{Rahnuma.hlOutputFormat}"
                                            id="hlOutputFormat" style="font-size: 12px; font-weight: bold" target="_blank" text="[?]"
                                            toolTip="#{SessionBean1.helpOutputFormat}" url="helpmain.html#OutputFormat"/>
                                        <webuijsf:radioButtonGroup binding="#{Rahnuma.rbgOutputFormat}" id="rbgOutputFormat"
                                            items="#{SessionBean1.outputFormats}" selected="#{SessionBean1.selectedOutputFormat}"
                                            style="font-size: 12px; line-height: 22px" tabIndex="12"/>
                                    </webuijsf:panelLayout>
                                </h:panelGrid>
                            </webuijsf:panelLayout>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout binding="#{Rahnuma.loButtons}" id="loButtons" panelLayout="flow" style="margin-top: 50px; margin-bottom: 50px; text-align: center; width: 700px">
                            <webuijsf:button actionExpression="#{Rahnuma.btnNext_action}" alt="Next" binding="#{Rahnuma.btnNext}" id="btnNext" primary="true"
                                style="font-size: 12px; text-align: center; width: 15mm" tabIndex="13" text="Next"/>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout binding="#{Rahnuma.loFooter}" id="loFooter" panelLayout="flow" style="margin-top: 50px; margin-bottom:0px; text-align: center; width: 700px">
                            <webuijsf:staticText binding="#{Rahnuma.stxtFooter1}" id="stxtFooter1" style="font-size: 10px;" text="A joint project between"/>
                            <webuijsf:hyperlink binding="#{Rahnuma.hlStatistics}" id="hlStatistics" style="font-size: 10px; padding-left: 2px" target="_blank"
                                text="Department of Statistics" url="http://www.stats.ox.ac.uk"/>
                            <webuijsf:staticText binding="#{Rahnuma.stxtFooter2}" id="stxtFooter2" style="font-size: 10px" text=" and"/>
                            <webuijsf:hyperlink binding="#{Rahnuma.hlPlantsSciences}" id="hlPlantsSciences" style="font-size: 10px; padding-left: 2px"
                                target="_blank" text="Department of Plant Sciences" url="http://www.plants.ox.ac.uk"/>
                            <webuijsf:staticText binding="#{Rahnuma.stxtFooter3}" id="stxtFooter3" style="font-size: 10px" text=","/>
                            <webuijsf:hyperlink binding="#{Rahnuma.hlOxford}" id="hlOxford" style="font-size: 10px; padding-left: 2px" target="_blank"
                                text="University of Oxford" url="http://www.ox.ac.uk"/>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout binding="#{Rahnuma.loDisclaimer}" id="loDisclaimer" panelLayout="flow" style="margin-top: 2px; margin-bottom: 50px; text-align: center; width: 700px">
                            <webuijsf:staticText binding="#{Rahnuma.stxtDisclaimerLabel}" id="stxtDisclaimerLabel" style="font-size: 10px; font-weight: bold" text="Disclaimer:"/>
                            <webuijsf:staticText binding="#{Rahnuma.stxtDisclaimer}" id="stxtDisclaimer" style="font-size: 10px; padding-left: 3px" text="The University of Oxford does not guarantee the accuracy of any data nor the suitability of the software for any purpose."/>
                        </webuijsf:panelLayout>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
