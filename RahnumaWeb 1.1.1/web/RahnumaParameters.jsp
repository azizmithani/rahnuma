<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : RahnumaParameters
    Created on : 29-Jan-2008, 21:20:35
    Author     : mithani
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{RahnumaParameters.page1}" id="page1">
            <webuijsf:html binding="#{RahnumaParameters.html1}" id="html1">
                <webuijsf:head binding="#{RahnumaParameters.head1}" id="head1" title="Rahnuma: Pathway Analysis and Network Comparison Tool">
                    <webuijsf:link binding="#{RahnumaParameters.link1}" id="link1" url="/resources/stylesheet.css"/>
                    <script type="text/javascript">
                        function refreshForOrganism1(component) {
                            document.getElementById('form1:loParameters:loOrganism1:loSelectOrganism1:lblOrganism1Set').refresh(component + '1');
                            document.getElementById('form1:loParameters:loOrganism1:loSelectOrganism1:drpOrganism1Set').refresh(component + '1a');
                            document.getElementById('form1:loParameters:loOrganism1:loSelectOrganism1:stxtOrganism1').refresh(component + '1c');
                            document.getElementById('form1:loParameters:loOrganism1:loSelectOrganism1:gpOrganism1Mode:lblOrganism1Mode').refresh(component + '1d');
                            document.getElementById('form1:loParameters:loOrganism1:loSelectOrganism1:gpOrganism1Mode:hlOrganism1Mode').refresh(component + '1e');
                            document.getElementById('form1:loParameters:loOrganism1:loSelectOrganism1:gpOrganism1Mode:rbgOrganism1Mode').refresh(component + '1f');
                            
                            return false;
                        }
                        function refreshForOrganism2(component) {
                            document.getElementById('form1:loParameters:loOrganism2:loSelectOrganism2:lblOrganism2Set').refresh(component + '1');
                            document.getElementById('form1:loParameters:loOrganism2:loSelectOrganism2:drpOrganism2Set').refresh(component + '1a');
                            document.getElementById('form1:loParameters:loOrganism2:loSelectOrganism2:stxtOrganism2').refresh(component + '1c');
                            document.getElementById('form1:loParameters:loOrganism2:loSelectOrganism2:gpOrganism2Mode:lblOrganism2Mode').refresh(component + '1d');
                            document.getElementById('form1:loParameters:loOrganism2:loSelectOrganism2:gpOrganism2Mode:hlOrganism2Mode').refresh(component + '1e');
                            document.getElementById('form1:loParameters:loOrganism2:loSelectOrganism2:gpOrganism2Mode:rbgOrganism2Mode').refresh(component + '1f');
                            
                            return false;
                        }
                        function refreshForPathwayPredictionMode(component) {
                            document.getElementById('form1:loPathwayParameters:loConnectionOption:rbgConnectionOption').refresh(component);
                            document.getElementById('form1:loPathwayParameters:loConnectionOption:lblConnectionOption').refresh(component + '1');
                            document.getElementById('form1:loPathwayParameters:loConnectionOption:hlConnectionOption').refresh(component + '2');
                            return false;
                        }
                        function refreshForConnectionOption(component) {
//                            document.getElementById('form1:loPathwayParameters:loConnectionFile:gpConnectionFile:lblConnectionFile').refresh(component);
                            document.getElementById('form1:loPathwayParameters:loConnectionFile:gpConnectionFile:fileConnections').refresh(component + '1');
//                            document.getElementById('form1:loPathwayParameters:loConnectionFile:stxtConnectionFile').refresh(component + '2');
                            return false;
                        }
                        function refreshForNeighbourhoodMode1(component) {
                            document.getElementById('form1:loParameters:loNPOrganism1:loNetworkCutoff1:gpNetworkCutoff1:lblNetworkCutoff1').refresh(component);
                            document.getElementById('form1:loParameters:loNPOrganism1:loNetworkCutoff1:gpNetworkCutoff1:hlNetworkCutoff1').refresh(component + '1');
                            document.getElementById('form1:loParameters:loNPOrganism1:loNetworkCutoff1:gpNetworkCutoff1:txtNetworkCutoff1').refresh(component + '2');
                            document.getElementById('form1:loParameters:loNPOrganism1:loNetworkCutoff1:stxtNetworkCutoff1').refresh(component + '3');
                            document.getElementById('form1:loParameters:loNPOrganism1:loOptionalParameters1:lblOptionalParametersNetworkBuilding1').refresh(component + '4');
                            document.getElementById('form1:loParameters:loNPOrganism1:loOptionalParameters1:hlOptionalParametersNetworkBuilding1').refresh(component + '5');
                            document.getElementById('form1:loParameters:loNPOrganism1:loOptionalParameters1:gpIgnoreMetabolitesNetworkBuilding1:lblIgnoreMetabolitesNetworkBuilding1').refresh(component + '6');
                            document.getElementById('form1:loParameters:loNPOrganism1:loOptionalParameters1:gpIgnoreMetabolitesNetworkBuilding1:fileIgnoreMetabolitesNetworkBuilding1').refresh(component + '7');
                            return false;
                        }
                    </script>
                </webuijsf:head>
                <webuijsf:body binding="#{RahnumaParameters.body1}" id="body1">
                    <br/>
                    <webuijsf:form binding="#{RahnumaParameters.frmHeader}" id="frmHeader">
                        <webuijsf:panelLayout binding="#{RahnumaParameters.loTitle}" id="loTitle" panelLayout="flow" style="text-align: center; vertical-align: middle; width: 750px">
                            <webuijsf:panelGroup binding="#{RahnumaParameters.gpTitle}" block="true" id="gpTitle">
                                <webuijsf:image align="bottom" binding="#{RahnumaParameters.imgTitle}" id="imgTitle" style="margin-right: 5px" url="/resources/title.JPG"/>
                                <webuijsf:button actionExpression="#{RahnumaParameters.btnHelp_action}" alt="Help" binding="#{RahnumaParameters.btnHelp}"
                                    id="btnHelp" mini="true" onClick="window.open(&quot;helpparameters.html&quot;);&#xa;return false;"
                                    style="font-size: 12px; margin-bottom: 5px; text-align: center; width: 15mm" text="Help"/>
                                <webuijsf:button actionExpression="#{RahnumaParameters.btnAbout_action}" alt="About" binding="#{RahnumaParameters.btnAbout}"
                                    id="btnAbout" mini="true" onClick="window.open(&quot;about.html&quot;);&#xa;return false;"
                                    style="font-size: 12px; margin-bottom: 5px; text-align: center; width: 15mm" text="About"/>
                            </webuijsf:panelGroup>
                            <webuijsf:panelGroup binding="#{RahnumaParameters.gpVersion}" block="true" id="gpVersion" style="margin-right: 80px">
                                <webuijsf:staticText binding="#{RahnumaParameters.stxtVersion}" id="stxtVersion" style="font-size: 12px; font-weight: bold" text="#{ApplicationBean1.version}"/>
                            </webuijsf:panelGroup>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout binding="#{RahnumaParameters.loPageNo}" id="loPageNo" panelLayout="flow" style="margin-top: 10px; margin-bottom: 20px; text-align: center; width: 700px">
                            <webuijsf:staticText binding="#{RahnumaParameters.stPageNo}" id="stPageNo"
                                style="color: navy; font-size: 12px; font-weight: bold; height: 20px; margin-right: 30px; text-align: center; width: 206px" text="== Page 2 of 2 =="/>
                        </webuijsf:panelLayout>
                    </webuijsf:form>
                    <webuijsf:form binding="#{RahnumaParameters.form1}" id="form1" virtualFormsConfig="">
                        <br/>
                        <webuijsf:panelLayout binding="#{RahnumaParameters.loJobSubmissionError}" id="loJobSubmissionError" panelLayout="flow" style="margin-left: 25px; margin-top: 5px; width: 100%">
                            <webuijsf:staticText binding="#{RahnumaParameters.stxtJobSubmissionError}" id="stxtJobSubmissionError" style="color: rgb(204, 0, 0); font-size: 12px; margin-bottom:10px; width: 100%"/>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout binding="#{RahnumaParameters.loParameters}" id="loParameters" panelLayout="flow" style="margin-left: 25px; margin-top: 5px; width: 100%">
                            <webuijsf:panelLayout binding="#{RahnumaParameters.loParametersHeading}" id="loParametersHeading" panelLayout="flow" style="margin-bottom: 15px; width: 100%">
                                <webuijsf:staticText binding="#{RahnumaParameters.stxtParameters}" id="stxtParameters"
                                    style="font-size: 14px; font-weight: bold; text-decoration: underline" text="Parameters"/>
                            </webuijsf:panelLayout>
                            <webuijsf:panelLayout binding="#{RahnumaParameters.loPhylogeny}" id="loPhylogeny" panelLayout="flow" style="margin-left: 25px;width: 700px">
                                <webuijsf:label binding="#{RahnumaParameters.lblPhylogeny}" id="lblPhylogeny"
                                    style="color: green; font-size: 12px; margin-bottom: 5px" text="Phylogeny *"/>
                                <webuijsf:hyperlink actionExpression="#{RahnumaParameters.hlPhylogeny_action}" binding="#{RahnumaParameters.hlPhylogeny}"
                                    id="hlPhylogeny" style="font-size: 12px; font-weight: bold" target="_blank" text="[?]"
                                    toolTip="#{SessionBean1.helpPhylogeny}" url="helpparameters.html#Phylogeny"/>
                                <webuijsf:panelGroup binding="#{RahnumaParameters.gpPhylogeny}" block="true" id="gpPhylogeny">
                                    <webuijsf:textArea binding="#{RahnumaParameters.txtPhylogeny}" columns="120" id="txtPhylogeny" rows="12"
                                        style="font-family: monospace; font-size: 12px; margin-top: 5px; width: 99%" tabIndex="1" text="#{SessionBean1.phylogeny}"/>
                                </webuijsf:panelGroup>
                                <webuijsf:staticText binding="#{RahnumaParameters.stxtPhylogeny}" id="stxtPhylogeny" style="color: rgb(204, 0, 0); font-size: 12px; margin-bottom:10px; width: 100%"/>
                            </webuijsf:panelLayout>
                            <webuijsf:panelLayout binding="#{RahnumaParameters.loOrganism1}" id="loOrganism1" panelLayout="flow" style="margin-left: 25px; margin-top: 15px; width: 700px">
                                <webuijsf:label binding="#{RahnumaParameters.lblOrganism1}" for="rbgOrganism1" id="lblOrganism1"
                                    style="color: green; font-size: 12px" text="#{SessionBean1.labelOrganism1}"/>
                                <webuijsf:hyperlink actionExpression="#{RahnumaParameters.hlOrganism1_action}" binding="#{RahnumaParameters.hlOrganism1}"
                                    id="hlOrganism1" style="font-size: 12px; font-weight: bold" target="_blank" text="[?]"
                                    toolTip="#{SessionBean1.helpOrganism}" url="helpparameters.html#Organism"/>
                                <webuijsf:panelLayout binding="#{RahnumaParameters.loOrganism1Options}" id="loOrganism1Options" panelLayout="flow" style="width: 100%">
                                    <webuijsf:radioButtonGroup binding="#{RahnumaParameters.rbgOrganism1}" id="rbgOrganism1"
                                        items="#{SessionBean1.organism1Options}"
                                        onClick="webui.suntheme.common.timeoutSubmitForm(this.form, 'loParameters:loOrganism1:loOrganism1Options:rbgOrganism1');"
                                        selected="#{SessionBean1.selectedOptionOrganism1}" style="font-size: 12px; line-height: 22px" tabIndex="2" valueChangeListenerExpression="#{RahnumaParameters.rbgOrganism1_processValueChange}"/>
                                </webuijsf:panelLayout>
                                <webuijsf:panelLayout binding="#{RahnumaParameters.loSelectOrganism1}" id="loSelectOrganism1" panelLayout="flow" style="margin-left: 25px;width: 700px">
                                    <webuijsf:label binding="#{RahnumaParameters.lblOrganism1Set}" id="lblOrganism1Set" style="color: navy; font-size: 12px" text="Show Subset"/>
                                    <webuijsf:dropDown binding="#{RahnumaParameters.drpOrganism1Set}" id="drpOrganism1Set" items="#{SessionBean1.organism1Set}"
                                        onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'loParameters:loOrganism1:loSelectOrganism1:drpOrganism1Set');"
                                        selected="#{SessionBean1.selectedOrganism1Set}" tabIndex="3" valueChangeListenerExpression="#{RahnumaParameters.drpOrganism1Set_processValueChange}"/>
                                    <webuijsf:addRemove availableItemsLabel="Available:" binding="#{RahnumaParameters.arOrganism1}" id="arOrganism1"
                                        items="#{SessionBean1.organismList1}" selectAll="true" selected="#{SessionBean1.selectedOrganisms1}"
                                        selectedItemsLabel="Selected:" sorted="true" style="width: 99%" tabIndex="4"/>
                                    <webuijsf:staticText binding="#{RahnumaParameters.stxtOrganism1}" id="stxtOrganism1" style="color: rgb(204, 0, 0); font-size: 12px; margin-bottom:15px; margin-left:5px; width: 100%"/>
                                    <webuijsf:panelGroup binding="#{RahnumaParameters.gpOrganism1Mode}" block="true" id="gpOrganism1Mode" style="margin-left: 0px; width: 100%">
                                        <webuijsf:label binding="#{RahnumaParameters.lblOrganism1Mode}" for="rbgOrganism1Mode" id="lblOrganism1Mode"
                                            style="color: green; font-size: 12px" text="Network Mode"/>
                                        <webuijsf:hyperlink actionExpression="#{RahnumaParameters.hlOrganism1Mode_action}"
                                            binding="#{RahnumaParameters.hlOrganism1Mode}" id="hlOrganism1Mode" style="font-size: 12px; font-weight: bold"
                                            target="_blank" text="[?]" toolTip="#{SessionBean1.helpOrganismMode}" url="helpparameters.html#OrganismMode"/>
                                        <webuijsf:radioButtonGroup binding="#{RahnumaParameters.rbgOrganism1Mode}" id="rbgOrganism1Mode"
                                            items="#{SessionBean1.organismModes}"
                                            onClick="webui.suntheme.common.timeoutSubmitForm(this.form, 'loParameters:loOrganism1:loSelectOrganism1:gpOrganism1Mode:rbgOrganism1Mode');"
                                            selected="#{SessionBean1.selectedOrganism1Mode}" style="font-size: 12px; line-height: 22px" tabIndex="5" valueChangeListenerExpression="#{RahnumaParameters.rbgOrganism1Mode_processValueChange}"/>
                                    </webuijsf:panelGroup>
                                </webuijsf:panelLayout>
                            </webuijsf:panelLayout>
                            <webuijsf:panelLayout binding="#{RahnumaParameters.loNetworkParametersHeading}" id="loNetworkParametersHeading" panelLayout="flow" style="margin-top: 30px; margin-bottom: 25px;  width: 700px">
                                <webuijsf:staticText binding="#{RahnumaParameters.stxtNetworkParameters}" id="stxtNetworkParameters"
                                    style="font-size: 14px; font-weight: bold; text-decoration: underline" text="Network Building Parameters"/>
                            </webuijsf:panelLayout>
                            <webuijsf:panelLayout binding="#{RahnumaParameters.loNPOrganism1}" id="loNPOrganism1" panelLayout="flow" style="margin-left: 50px; margin-bottom: 25px; width: 700px">
                                <webuijsf:panelLayout binding="#{RahnumaParameters.loNetworkCutoff1}" id="loNetworkCutoff1" panelLayout="flow" style="margin-top: 5px; width: 100%">
                                    <webuijsf:panelGroup binding="#{RahnumaParameters.gpNetworkCutoff1}" block="true" id="gpNetworkCutoff1" style="width: 100%;margin-bottom: 5px">
                                        <webuijsf:label binding="#{RahnumaParameters.lblNetworkCutoff1}" id="lblNetworkCutoff1"
                                            style="color: green; font-size: 12px" text="Neighbourhood Cutoff"/>
                                        <webuijsf:hyperlink binding="#{RahnumaParameters.hlNetworkCutoff1}" id="hlNetworkCutoff1"
                                            style="font-size: 12px; font-weight: bold" target="_blank" text="[?]"
                                            toolTip="#{SessionBean1.helpNeighbourhoodCutoff}" url="helpparameters.html#CutoffNeighbourhood"/>
                                        <webuijsf:textField binding="#{RahnumaParameters.txtNetworkCutoff1}" columns="4" id="txtNetworkCutoff1"
                                            style="font-size: 12px; margin-left: 5px" tabIndex="9" text="#{SessionBean1.cutoffNeighbourhood1}"/>
                                    </webuijsf:panelGroup>
                                    <webuijsf:staticText binding="#{RahnumaParameters.stxtNetworkCutoff1}" id="stxtNetworkCutoff1" style="color: rgb(204, 0, 0); font-size: 12px; height: 12px; margin-left:190px"/>
                                </webuijsf:panelLayout>
                                <webuijsf:panelLayout binding="#{RahnumaParameters.loOptionalParameters1}" id="loOptionalParameters1" panelLayout="flow" style="margin-top: 15px; width: 100%">
                                    <webuijsf:label binding="#{RahnumaParameters.lblOptionalParametersNetworkBuilding1}"
                                        id="lblOptionalParametersNetworkBuilding1" style="color: green; font-size: 12px" text="Optional Network Building Parameter"/>
                                    <webuijsf:hyperlink binding="#{RahnumaParameters.hlOptionalParametersNetworkBuilding1}"
                                        id="hlOptionalParametersNetworkBuilding1" style="font-size: 12px; font-weight: bold" target="_blank" text="[?]"
                                        toolTip="#{SessionBean1.helpNeighbourhoodOptionalConstraint}" url="helpparameters.html#IgnoreMetabolitesNetworkBuilding"/>
                                    <webuijsf:panelGroup binding="#{RahnumaParameters.gpIgnoreMetabolitesNetworkBuilding1}" block="true"
                                        id="gpIgnoreMetabolitesNetworkBuilding1" style="margin-left: 25px;margin-top: 10px; margin-bottom: 5px">
                                        <webuijsf:label binding="#{RahnumaParameters.lblIgnoreMetabolitesNetworkBuilding1}"
                                            id="lblIgnoreMetabolitesNetworkBuilding1" style="color: navy; font-size: 12px" text="Ignore Metabolites"/>
                                        <webuijsf:upload binding="#{RahnumaParameters.fileIgnoreMetabolitesNetworkBuilding1}" columns="57"
                                            id="fileIgnoreMetabolitesNetworkBuilding1" style="margin-left: 2px" tabIndex="10" valueChangeListenerExpression="#{RahnumaParameters.fileIgnoreMetabolitesNetworkBuilding1_processValueChange}"/>
                                        <webuijsf:hyperlink binding="#{RahnumaParameters.hlIgnoreMetabolitesNetworkBuilding1}"
                                            id="hlIgnoreMetabolitesNetworkBuilding1" style="font-size: 12px; font-weight: bold; margin-left: 10px"
                                            target="_blank" text="[Download a typical list]" url="http://portal.stats.ox.ac.uk/userdata/rahnuma/files/ignoremetabolites.txt"/>
                                    </webuijsf:panelGroup>
                                    <webuijsf:staticText binding="#{RahnumaParameters.stxtIgnoreMetabolitesNetworkBuilding1}"
                                        id="stxtIgnoreMetabolitesNetworkBuilding1" style="color: green; font-size: 12px; margin-left: 140px; margin-bottom: 10px; width: 100%"/>
                                    <webuijsf:button actionExpression="#{RahnumaParameters.btnIgnoreMetabolitesNetworkBuilding1_action}"
                                        binding="#{RahnumaParameters.btnIgnoreMetabolitesNetworkBuilding1}" id="btnIgnoreMetabolitesNetworkBuilding1"
                                        mini="true"
                                        onClick="document.getElementById('form1:loParameters:loNPOrganism1:loOptionalParameters1:btnOptionalParametersNetworkBuilding1').refresh('form1:loParameters:loNPOrganism1:loOptionalParameters1:btnOptionalParametersNetworkBuilding1');&#xd;&#xa;return false;"
                                        style="font-size: 12px; margin-left: 5px; margin-bottom: 5px; text-align: center; width: 15mm" text="Remove"/>
                                </webuijsf:panelLayout>
                            </webuijsf:panelLayout>
                            <webuijsf:panelLayout binding="#{RahnumaParameters.loOrganism2}" id="loOrganism2" panelLayout="flow" style="margin-left: 25px; margin-top: 15px; width: 700px">
                                <webuijsf:label binding="#{RahnumaParameters.lblOrganism2}" for="rbgOrganism2" id="lblOrganism2"
                                    style="color: green; font-size: 12px" text="Organism(s) 2 *"/>
                                <webuijsf:hyperlink actionExpression="#{RahnumaParameters.hlOrganism2_action}" binding="#{RahnumaParameters.hlOrganism2}"
                                    id="hlOrganism2" style="font-size: 12px; font-weight: bold" target="_blank" text="[?]"
                                    toolTip="#{SessionBean1.helpOrganism}" url="helpparameters.html#Organism"/>
                                <webuijsf:panelLayout binding="#{RahnumaParameters.loOrganism2Options}" id="loOrganism2Options" panelLayout="flow" style="width: 100%">
                                    <webuijsf:radioButtonGroup binding="#{RahnumaParameters.rbgOrganism2}" id="rbgOrganism2"
                                        items="#{SessionBean1.organism2Options}"
                                        onClick="webui.suntheme.common.timeoutSubmitForm(this.form, 'loParameters:loOrganism2:loOrganism2Options:rbgOrganism2');"
                                        selected="#{SessionBean1.selectedOptionOrganism2}" style="font-size: 12px; line-height: 22px" tabIndex="6" valueChangeListenerExpression="#{RahnumaParameters.rbgOrganism2_processValueChange}"/>
                                </webuijsf:panelLayout>
                                <webuijsf:panelLayout binding="#{RahnumaParameters.loSelectOrganism2}" id="loSelectOrganism2" panelLayout="flow" style="margin-left: 25px;width: 700px">
                                    <webuijsf:label binding="#{RahnumaParameters.lblOrganism2Set}" id="lblOrganism2Set" style="color: navy; font-size: 12px" text="Show Subset"/>
                                    <webuijsf:dropDown binding="#{RahnumaParameters.drpOrganism2Set}" id="drpOrganism2Set" items="#{SessionBean1.organism2Set}"
                                        onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'loParameters:loOrganism2:loSelectOrganism2:drpOrganism2Set');"
                                        selected="#{SessionBean1.selectedOrganism2Set}" valueChangeListenerExpression="#{RahnumaParameters.drpOrganism2Set_processValueChange}"/>
                                    <webuijsf:addRemove availableItemsLabel="Available:" binding="#{RahnumaParameters.arOrganism2}" id="arOrganism2"
                                        items="#{SessionBean1.organismList2}" selectAll="true" selected="#{SessionBean1.selectedOrganisms2}"
                                        selectedItemsLabel="Selected:" sorted="true" style="width: 99%" tabIndex="7"/>
                                    <webuijsf:staticText binding="#{RahnumaParameters.stxtOrganism2}" id="stxtOrganism2" style="color: rgb(204, 0, 0); font-size: 12px; margin-bottom:15px; margin-left:5px; width: 100%"/>
                                    <webuijsf:panelGroup binding="#{RahnumaParameters.gpOrganism2Mode}" block="true" id="gpOrganism2Mode" style="margin-left: 0px; width: 100%">
                                        <webuijsf:label binding="#{RahnumaParameters.lblOrganism2Mode}" id="lblOrganism2Mode"
                                            style="color: green; font-size: 12px" text="Mode"/>
                                        <webuijsf:hyperlink actionExpression="#{RahnumaParameters.hlOrganism2Mode_action}"
                                            binding="#{RahnumaParameters.hlOrganism2Mode}" id="hlOrganism2Mode" style="font-size: 12px; font-weight: bold"
                                            target="_blank" text="[?]" toolTip="#{SessionBean1.helpOrganismMode}" url="helpparameters.html#OrganismMode"/>
                                        <webuijsf:radioButtonGroup binding="#{RahnumaParameters.rbgOrganism2Mode}" id="rbgOrganism2Mode"
                                            items="#{SessionBean1.organismModes}"
                                            onClick="webui.suntheme.common.timeoutSubmitForm(this.form, 'loParameters:loOrganism2:loSelectOrganism2:gpOrganism2Mode:rbgOrganism2Mode');"
                                            selected="#{SessionBean1.selectedOrganism2Mode}" style="font-size: 12px; line-height: 22px" tabIndex="8" valueChangeListenerExpression="#{RahnumaParameters.rbgOrganism2Mode_processValueChange}"/>
                                    </webuijsf:panelGroup>
                                    <webuijsf:panelLayout binding="#{RahnumaParameters.loNPOrganism2}" id="loNPOrganism2" panelLayout="flow" style="margin-left: 0px; margin-top: 15px; width: 700px">
                                        <webuijsf:panelLayout binding="#{RahnumaParameters.loNetworkCutoff2}" id="loNetworkCutoff2" panelLayout="flow" style="margin-top: 5px; width: 100%">
                                            <webuijsf:panelGroup binding="#{RahnumaParameters.gpNetworkCutoff2}" block="true" id="gpNetworkCutoff2" style="width: 100%;margin-bottom: 5px">
                                                <webuijsf:label binding="#{RahnumaParameters.lblNetworkCutoff2}" id="lblNetworkCutoff2"
                                                    style="color: green; font-size: 12px" text="Neighbourhood Cutoff"/>
                                                <webuijsf:hyperlink binding="#{RahnumaParameters.hlNetworkCutoff2}" id="hlNetworkCutoff2"
                                                    style="font-size: 12px; font-weight: bold" target="_blank" text="[?]"
                                                    toolTip="#{SessionBean1.helpNeighbourhoodCutoff}" url="helpparameters.html#CutoffNeighbourhood"/>
                                                <webuijsf:textField binding="#{RahnumaParameters.txtNetworkCutoff2}" columns="4" id="txtNetworkCutoff2"
                                                    style="font-size: 12px; margin-left: 5px" text="#{SessionBean1.cutoffNeighbourhood2}"/>
                                            </webuijsf:panelGroup>
                                            <webuijsf:staticText binding="#{RahnumaParameters.stxtNetworkCutoff2}" id="stxtNetworkCutoff2" style="color: rgb(204, 0, 0); font-size: 12px; height: 12px; margin-left:190px"/>
                                        </webuijsf:panelLayout>
                                        <webuijsf:panelLayout binding="#{RahnumaParameters.loOptionalParameters2}" id="loOptionalParameters2" panelLayout="flow" style="margin-top: 15px; width: 100%">
                                            <webuijsf:label binding="#{RahnumaParameters.lblOptionalParametersNetworkBuilding2}"
                                                id="lblOptionalParametersNetworkBuilding2" style="color: green; font-size: 12px" text="Optional Network Building Parameter"/>
                                            <webuijsf:hyperlink binding="#{RahnumaParameters.hlOptionalParametersNetworkBuilding2}"
                                                id="hlOptionalParametersNetworkBuilding2" style="font-size: 12px; font-weight: bold" target="_blank" text="[?]"
                                                toolTip="#{SessionBean1.helpNeighbourhoodOptionalConstraint}" url="helpparameters.html#IgnoreMetabolitesNetworkBuilding"/>
                                            <webuijsf:panelGroup binding="#{RahnumaParameters.gpIgnoreMetabolitesNetworkBuilding2}" block="true"
                                                id="gpIgnoreMetabolitesNetworkBuilding2" style="margin-left: 25px;margin-top: 10px; margin-bottom: 10px">
                                                <webuijsf:label binding="#{RahnumaParameters.lblIgnoreMetabolitesNetworkBuilding2}"
                                                    id="lblIgnoreMetabolitesNetworkBuilding2" style="color: navy; font-size: 12px" text="Ignore Metabolites"/>
                                                <webuijsf:upload binding="#{RahnumaParameters.fileIgnoreMetabolitesNetworkBuilding2}" columns="57"
                                                    id="fileIgnoreMetabolitesNetworkBuilding2" style="margin-left: 2px" valueChangeListenerExpression="#{RahnumaParameters.fileIgnoreMetabolitesNetworkBuilding2_processValueChange}"/>
                                                <webuijsf:hyperlink binding="#{RahnumaParameters.hlIgnoreMetabolitesNetworkBuilding2}"
                                                    id="hlIgnoreMetabolitesNetworkBuilding2" style="font-size: 12px; font-weight: bold; margin-left: 10px"
                                                    target="_blank" text="[Download a typical list]" url="http://portal.stats.ox.ac.uk/userdata/rahnuma/files/ignoremetabolites.txt"/>
                                            </webuijsf:panelGroup>
                                            <webuijsf:staticText binding="#{RahnumaParameters.stxtIgnoreMetabolitesNetworkBuilding2}"
                                                id="stxtIgnoreMetabolitesNetworkBuilding2" style="color: green; font-size: 12px; margin-left: 140px; margin-bottom: 10px; width: 100%"/>
                                            <webuijsf:button actionExpression="#{RahnumaParameters.btnIgnoreMetabolitesNetworkBuilding2_action}"
                                                binding="#{RahnumaParameters.btnIgnoreMetabolitesNetworkBuilding2}" id="btnIgnoreMetabolitesNetworkBuilding2"
                                                mini="true"
                                                onClick="document.getElementById('form1:loParameters:loNPOrganism2:loOptionalParameters2:btnOptionalParametersNetworkBuilding2').refresh('form1:loParameters:loNPOrganism2:loOptionalParameters2:btnOptionalParametersNetworkBuilding2');&#xd;&#xa;return false;"
                                                style="font-size: 12px; margin-left: 5px; margin-bottom: 5px; text-align: center; width: 15mm" text="Remove"/>
                                        </webuijsf:panelLayout>
                                    </webuijsf:panelLayout>
                                </webuijsf:panelLayout>
                            </webuijsf:panelLayout>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout binding="#{RahnumaParameters.loPathwayParameters}" id="loPathwayParameters" panelLayout="flow" style="margin-left: 25px; margin-top:30px; width: 100%">
                            <webuijsf:panelLayout binding="#{RahnumaParameters.loPathwayParametersHeading}" id="loPathwayParametersHeading" panelLayout="flow" style="width: 100%">
                                <webuijsf:staticText binding="#{RahnumaParameters.stxtPathwayParameters}" id="stxtPathwayParameters"
                                    style="font-size: 14px; font-weight: bold; text-decoration: underline" text="Pathway Specific Parameters"/>
                            </webuijsf:panelLayout>
                            <webuijsf:panelLayout binding="#{RahnumaParameters.loStartMetabolitesHeading}" id="loStartMetabolitesHeading" panelLayout="flow" style="margin-left: 25px; margin-top: 15px; margin-bottom: 10px;width: 100%">
                                <webuijsf:label binding="#{RahnumaParameters.lblStartMetabolites}" id="lblStartMetabolites"
                                    style="color: green; font-size: 12px" text="Start Metabolites *"/>
                                <webuijsf:hyperlink actionExpression="#{RahnumaParameters.hlStartMetabolites_action}"
                                    binding="#{RahnumaParameters.hlStartMetabolites}" id="hlStartMetabolites" style="font-size: 12px; font-weight: bold"
                                    target="_blank" text="[?]" toolTip="#{SessionBean1.helpStartMetabolites}" url="helpparameters.html#Metabolites"/>
                            </webuijsf:panelLayout>
                            <webuijsf:panelLayout binding="#{RahnumaParameters.loStartMetabolites}" id="loStartMetabolites" panelLayout="flow" style="margin-left: 50px;width: 700px">
                                <webuijsf:label binding="#{RahnumaParameters.lblStartMetaboliteSet}" id="lblStartMetaboliteSet"
                                    style="color: navy; font-size: 12px" text="Show Subset"/>
                                <webuijsf:dropDown binding="#{RahnumaParameters.drpStartMetaboliteSet}" id="drpStartMetaboliteSet"
                                    items="#{SessionBean1.startMetaboliteSet}"
                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'loPathwayParameters:loStartMetabolites:drpStartMetaboliteSet');"
                                    selected="#{SessionBean1.selectedStartMetaboliteSet}" tabIndex="11" valueChangeListenerExpression="#{RahnumaParameters.drpStartMetaboliteSet_processValueChange}"/>
                                <webuijsf:addRemove availableItemsLabel="Available:" binding="#{RahnumaParameters.arStartMetabolites}" id="arStartMetabolites"
                                    items="#{SessionBean1.startMetabolitesList}" selectAll="true" selected="#{SessionBean1.selectedStartMetabolites}"
                                    selectedItemsLabel="Selected:" sorted="true" style="width:99%" tabIndex="12"/>
                                <webuijsf:panelGroup binding="#{RahnumaParameters.gpStartMetabolitesNote}" block="true" id="gpStartMetabolitesNote">
                                    <webuijsf:staticText binding="#{RahnumaParameters.stxtStartMetabolitesNote}" id="stxtStartMetabolitesNote" style="font-size: 12px; font-weight: bold; margin-bottom:5px;"/>
                                </webuijsf:panelGroup>
                                <webuijsf:staticText binding="#{RahnumaParameters.stxtStartMetabolites}" id="stxtStartMetabolites" style="color: rgb(204, 0, 0); font-size: 12px; margin-bottom:10px; margin-left:5px; width: 100%"/>
                            </webuijsf:panelLayout>
                            <webuijsf:panelLayout binding="#{RahnumaParameters.loEndMetabolitesHeading}" id="loEndMetabolitesHeading" panelLayout="flow" style="margin-left: 25px; margin-top: 15px; margin-bottom: 10px;width: 100%">
                                <webuijsf:label binding="#{RahnumaParameters.lblEndMetabolites}" id="lblEndMetabolites" style="color: green; font-size: 12px" text="End Metabolites *"/>
                                <webuijsf:hyperlink actionExpression="#{RahnumaParameters.hlEndMetabolites_action}"
                                    binding="#{RahnumaParameters.hlEndMetabolites}" id="hlEndMetabolites" style="font-size: 12px; font-weight: bold"
                                    target="_blank" text="[?]" toolTip="#{SessionBean1.helpEndMetabolites}" url="helpparameters.html#Metabolites"/>
                            </webuijsf:panelLayout>
                            <webuijsf:panelLayout binding="#{RahnumaParameters.loEndMetabolites}" id="loEndMetabolites" panelLayout="flow" style="margin-left: 50px;width: 700px">
                                <webuijsf:label binding="#{RahnumaParameters.lblEndMetaboliteSet}" id="lblEndMetaboliteSet" style="color: navy; font-size: 12px" text="Show Subset"/>
                                <webuijsf:dropDown binding="#{RahnumaParameters.drpEndMetaboliteSet}" id="drpEndMetaboliteSet"
                                    items="#{SessionBean1.endMetaboliteSet}"
                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'loPathwayParameters:loEndMetabolites:drpEndMetaboliteSet');"
                                    selected="#{SessionBean1.selectedEndMetaboliteSet}" tabIndex="13" valueChangeListenerExpression="#{RahnumaParameters.drpEndMetaboliteSet_processValueChange}"/>
                                <webuijsf:addRemove availableItemsLabel="Available:" binding="#{RahnumaParameters.arEndMetabolites}" id="arEndMetabolites"
                                    items="#{SessionBean1.endMetabolitesList}" selectAll="true" selected="#{SessionBean1.selectedEndMetabolites}"
                                    selectedItemsLabel="Selected:" sorted="true" style="width:99%" tabIndex="14"/>
                                <webuijsf:panelGroup binding="#{RahnumaParameters.gpEndMetabolitesNote}" block="true" id="gpEndMetabolitesNote">
                                    <webuijsf:staticText binding="#{RahnumaParameters.stxtEndMetabolitesNote}" id="stxtEndMetabolitesNote" style="font-size: 12px; font-weight: bold; margin-bottom:5px;"/>
                                </webuijsf:panelGroup>
                                <webuijsf:staticText binding="#{RahnumaParameters.stxtEndMetabolites}" id="stxtEndMetabolites" style="color: rgb(204, 0, 0); font-size: 12px; margin-bottom:10px; margin-left:5px; width: 100%"/>
                            </webuijsf:panelLayout>
                            <webuijsf:panelLayout binding="#{RahnumaParameters.loPathwayPredictionMode}" id="loPathwayPredictionMode" panelLayout="flow" style="margin-left: 25px; margin-top: 15px; width: 100%">
                                <webuijsf:label binding="#{RahnumaParameters.lblPathwayPredictionMode}" id="lblPathwayPredictionMode"
                                    style="color: green; font-size: 12px" text="Mode"/>
                                <webuijsf:hyperlink actionExpression="#{RahnumaParameters.hlPathwayPredictionMode_action}"
                                    binding="#{RahnumaParameters.hlPathwayPredictionMode}" id="hlPathwayPredictionMode"
                                    style="font-size: 12px; font-weight: bold" target="_blank" text="[?]" toolTip="#{SessionBean1.helpPathwayPredictionMode}" url="helpparameters.html#PathwayPredictionMode"/>
                                <webuijsf:radioButtonGroup binding="#{RahnumaParameters.rbgPathwayPredictionMode}" id="rbgPathwayPredictionMode"
                                    items="#{SessionBean1.pathwayPredictionModes}"
                                    onClick="refreshForPathwayPredictionMode('form1:loPathwayParameters:loPathwayPredictionMode:rbgPathwayPredictionMode')"
                                    selected="#{SessionBean1.selectedPathwayPredictionMode}" style="font-size: 12px; line-height: 22px" tabIndex="15" valueChangeListenerExpression="#{RahnumaParameters.rbgPathwayPredictionMode_processValueChange}"/>
                            </webuijsf:panelLayout>
                            <webuijsf:panelLayout binding="#{RahnumaParameters.loConnectionOption}" id="loConnectionOption" panelLayout="flow" style="margin-left: 25px; margin-top: 15px; width: 100%">
                                <webuijsf:label binding="#{RahnumaParameters.lblConnectionOption}" for="rbgConnectionOption" id="lblConnectionOption"
                                    style="color: green; font-size: 12px" text="Connection Option"/>
                                <webuijsf:hyperlink actionExpression="#{RahnumaParameters.hlConnectionOption_action}"
                                    binding="#{RahnumaParameters.hlConnectionOption}" id="hlConnectionOption" style="font-size: 12px; font-weight: bold"
                                    target="_blank" text="[?]" toolTip="#{SessionBean1.helpConnectionOption}" url="helpparameters.html#ConnectionOption"/>
                                <webuijsf:radioButtonGroup binding="#{RahnumaParameters.rbgConnectionOption}" id="rbgConnectionOption"
                                    items="#{SessionBean1.connectionOptions}"
                                    onClick="refreshForConnectionOption('form1:loPathwayParameters:loConnectionOption:rbgConnectionOption')"
                                    selected="#{SessionBean1.selectedConnectionOption}" style="font-size: 12px; line-height: 22px" tabIndex="16" valueChangeListenerExpression="#{RahnumaParameters.rbgConnectionOption_processValueChange}"/>
                            </webuijsf:panelLayout>
                            <webuijsf:panelLayout binding="#{RahnumaParameters.loConnectionFile}" id="loConnectionFile" panelLayout="flow" style="margin-left: 75px; margin-top: 5px; width: 100%">
                                <webuijsf:panelGroup binding="#{RahnumaParameters.gpConnectionFile}" block="true" id="gpConnectionFile" style="margin-bottom: 5px">
                                    <webuijsf:label binding="#{RahnumaParameters.lblConnectionFile}" id="lblConnectionFile" style="color: navy; font-size: 12px" text="Connection File *"/>
                                    <webuijsf:upload binding="#{RahnumaParameters.fileConnections}" columns="58" id="fileConnections"
                                        onClick="refreshForIgnoreMetabolites('loPathwayParameters')" tabIndex="17" valueChangeListenerExpression="#{RahnumaParameters.fileConnections_processValueChange}"/>
                                </webuijsf:panelGroup>
                                <webuijsf:staticText binding="#{RahnumaParameters.stxtConnectionFile}" id="stxtConnectionFile" style="color: rgb(204, 0, 0); font-size: 12px; margin-bottom:10px; width: 100%; margin-left:100px"/>
                                <webuijsf:staticText binding="#{RahnumaParameters.stxtConnectionFileStatus}" id="stxtConnectionFileStatus" style="color: green; font-size: 12px; margin-left: 100px; margin-bottom: 10px; width: 100%"/>
                                <webuijsf:button actionExpression="#{RahnumaParameters.btnConnectionFile_action}"
                                    binding="#{RahnumaParameters.btnConnectionFile}" id="btnConnectionFile" mini="true"
                                    style="font-size: 12px; margin-left: 5px; margin-bottom: 5px; text-align: center; width: 15mm" text="Remove"/>
                            </webuijsf:panelLayout>
                            <webuijsf:panelLayout binding="#{RahnumaParameters.loCutoffLength}" id="loCutoffLength" panelLayout="flow" style="margin-left: 25px; margin-top: 15px; width: 100%">
                                <webuijsf:panelGroup binding="#{RahnumaParameters.gpCutoffLength}" block="true" id="gpCutoffLength" style="width: 100%;margin-bottom: 5px">
                                    <webuijsf:label binding="#{RahnumaParameters.lblCutoffLength}" for="txtCutoffLength" id="lblCutoffLength"
                                        style="color: green; font-size: 12px" text="Cutoff Length *"/>
                                    <webuijsf:hyperlink actionExpression="#{RahnumaParameters.hlCutoffLength_action}"
                                        binding="#{RahnumaParameters.hlCutoffLength}" id="hlCutoffLength" style="font-size: 12px; font-weight: bold"
                                        target="_blank" text="[?]" toolTip="#{SessionBean1.helpPathwayCutoff}" url="helpparameters.html#CutoffLength"/>
                                    <webuijsf:textField binding="#{RahnumaParameters.txtCutoffLength}" columns="2" id="txtCutoffLength"
                                        style="font-size: 12px; margin-left: 5px" tabIndex="18" text="#{SessionBean1.cutoffLength}"/>
                                </webuijsf:panelGroup>
                                <webuijsf:staticText binding="#{RahnumaParameters.stxtCutoffLength}" id="stxtCutoffLength" style="color: rgb(204, 0, 0); font-size: 12px; height: 12px; margin-left:115px"/>
                            </webuijsf:panelLayout>
                            <webuijsf:panelLayout binding="#{RahnumaParameters.loOptionalConstraints}" id="loOptionalConstraints" panelLayout="flow" style="margin-left: 25px; margin-top: 15px; width: 100%">
                                <webuijsf:label binding="#{RahnumaParameters.lblOptionalConstraints}" id="lblOptionalConstraints"
                                    style="color: green; font-size: 12px" text="Optional Constraints"/>
                                <webuijsf:hyperlink actionExpression="#{RahnumaParameters.hlOptionalConstraints_action}"
                                    binding="#{RahnumaParameters.hlOptionalConstraints}" id="hlOptionalConstraints" style="font-size: 12px; font-weight: bold"
                                    target="_blank" text="[?]" toolTip="#{SessionBean1.helpOptionalConstraints}" url="helpparameters.html#OptionalConstraints"/>
                                <webuijsf:panelGroup binding="#{RahnumaParameters.gpIgnoreMetabolites}" block="true" id="gpIgnoreMetabolites" style="margin-left: 25px;margin-top: 10px; margin-bottom: 5px">
                                    <webuijsf:label binding="#{RahnumaParameters.lblIgnoreMetabolites}" id="lblIgnoreMetabolites"
                                        style="color: navy; font-size: 12px" text="Ignore Metabolites"/>
                                    <webuijsf:upload binding="#{RahnumaParameters.fileIgnoreMetabolites}" columns="57" id="fileIgnoreMetabolites"
                                        style="margin-left: 2px" tabIndex="19" valueChangeListenerExpression="#{RahnumaParameters.fileIgnoreMetabolites_processValueChange}"/>
                                    <webuijsf:hyperlink binding="#{RahnumaParameters.hlIgnoreMetabolites}" id="hlIgnoreMetabolites"
                                        style="font-size: 12px; font-weight: bold; margin-left: 10px" target="_blank" text="[Download a typical list]" url="http://portal.stats.ox.ac.uk/userdata/rahnuma/files/ignoremetabolites.txt"/>
                                    <webuijsf:checkbox binding="#{RahnumaParameters.chkUseDefaultIgnoreMetabolites}" id="chkUseDefaultIgnoreMetabolites"
                                        label="Use Default List" selected="#{SessionBean1.useDefaultIgnoreMetabolites}"
                                        style="font-size: 12px; margin-left: 10px" valueChangeListenerExpression="#{RahnumaParameters.chkUseDefaultIgnoreMetabolites_processValueChange}"/>
                                </webuijsf:panelGroup>
                                <webuijsf:staticText binding="#{RahnumaParameters.stxtIgnoreMetabolitesFile}" id="stxtIgnoreMetabolitesFile" style="color: green; font-size: 12px; margin-left: 140px; margin-bottom: 20px; width: 100%"/>
                                <webuijsf:button actionExpression="#{RahnumaParameters.btnIgnoreMetabolitesFile_action}"
                                    binding="#{RahnumaParameters.btnIgnoreMetabolitesFile}" id="btnIgnoreMetabolitesFile" mini="true"
                                    style="font-size: 12px; margin-left: 5px; margin-bottom: 5px; text-align: center; width: 15mm" text="Remove"/>
                                <webuijsf:panelGroup binding="#{RahnumaParameters.gpRequiredElements}" block="true" id="gpRequiredElements" style="margin-left: 25px; margin-top: 10px; margin-bottom: 5px">
                                    <webuijsf:label binding="#{RahnumaParameters.lblRequiredElements}" id="lblRequiredElements"
                                        style="color: navy; font-size: 12px" text="Required Elements"/>
                                    <webuijsf:upload binding="#{RahnumaParameters.fileRequiredElements}" columns="57" id="fileRequiredElements" tabIndex="20" valueChangeListenerExpression="#{RahnumaParameters.fileRequiredElements_processValueChange}"/>
                                </webuijsf:panelGroup>
                                <webuijsf:staticText binding="#{RahnumaParameters.stxtRequiredElementsFile}" id="stxtRequiredElementsFile" style="color: green; font-size: 12px; margin-left: 140px; margin-bottom: 15px; width: 100%"/>
                                <webuijsf:button actionExpression="#{RahnumaParameters.btnRequiredElementsFile_action}"
                                    binding="#{RahnumaParameters.btnRequiredElementsFile}" id="btnRequiredElementsFile" mini="true"
                                    style="font-size: 12px; margin-left: 5px; margin-bottom: 5px; text-align: center; width: 15mm" text="Remove"/>
                            </webuijsf:panelLayout>
                            <webuijsf:panelLayout binding="#{RahnumaParameters.loReturnValue}" id="loReturnValue" panelLayout="flow" style="margin-left: 25px; margin-top: 15px; width: 100%">
                                <webuijsf:label binding="#{RahnumaParameters.lblReturnValue}" id="lblReturnValue" style="color: green; font-size: 12px" text="Return Value"/>
                                <webuijsf:hyperlink actionExpression="#{RahnumaParameters.hlReturnValue_action}" binding="#{RahnumaParameters.hlReturnValue}"
                                    id="hlReturnValue" style="font-size: 12px; font-weight: bold" target="_blank" text="[?]"
                                    toolTip="#{SessionBean1.helpReturnValue}" url="helpparameters.html#ReturnValue"/>
                                <webuijsf:radioButtonGroup binding="#{RahnumaParameters.rbgReturnValue}" id="rbgReturnValue"
                                    items="#{SessionBean1.returnValues}" selected="#{SessionBean1.selectedReturnValue}"
                                    style="font-size: 12px; line-height: 22px" tabIndex="21"/>
                            </webuijsf:panelLayout>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout binding="#{RahnumaParameters.loButtons}" id="loButtons" panelLayout="flow" style="margin-top: 50px; margin-bottom: 50px; text-align: center; width: 700px">
                            <webuijsf:button actionExpression="#{RahnumaParameters.btnBack_action}" binding="#{RahnumaParameters.btnBack}" id="btnBack"
                                style="font-size: 12px; text-align: center; width: 15mm" tabIndex="22" text="Back"/>
                            <webuijsf:button actionExpression="#{RahnumaParameters.btnSubmit_action}" alt="Next" binding="#{RahnumaParameters.btnSubmit}"
                                id="btnSubmit" primary="true" style="font-size: 12px; text-align: center; width: 18mm" tabIndex="23" text="Submit"/>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout binding="#{RahnumaParameters.loFooter}" id="loFooter" panelLayout="flow" style="margin-top: 50px; margin-bottom:0px; text-align: center; width: 700px">
                            <webuijsf:staticText binding="#{RahnumaParameters.stxtFooter1}" id="stxtFooter1" style="font-size: 10px;" text="A joint project between"/>
                            <webuijsf:hyperlink binding="#{RahnumaParameters.hlStatistics1}" id="hlStatistics1" style="font-size: 10px; padding-left: 2px"
                                target="_blank" text="Department of Statistics" url="http://www.stats.ox.ac.uk"/>
                            <webuijsf:staticText binding="#{RahnumaParameters.stxtFooter2}" id="stxtFooter2" style="font-size: 10px" text=" and"/>
                            <webuijsf:hyperlink binding="#{RahnumaParameters.hlPlantsSciences1}" id="hlPlantsSciences1"
                                style="font-size: 10px; padding-left: 2px" target="_blank" text="Department of Plant Sciences" url="http://www.plants.ox.ac.uk"/>
                            <webuijsf:staticText binding="#{RahnumaParameters.stxtFooter3}" id="stxtFooter3" style="font-size: 10px" text=","/>
                            <webuijsf:hyperlink binding="#{RahnumaParameters.hlOxford1}" id="hlOxford1" style="font-size: 10px; padding-left: 2px"
                                target="_blank" text="University of Oxford" url="http://www.ox.ac.uk"/>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout binding="#{RahnumaParameters.loDisclaimer}" id="loDisclaimer" panelLayout="flow" style="margin-top: 2px; margin-bottom: 50px; text-align: center; width: 700px">
                            <webuijsf:staticText binding="#{RahnumaParameters.stxtDisclaimerLabel1}" id="stxtDisclaimerLabel1"
                                style="font-size: 10px; font-weight: bold" text="Disclaimer:"/>
                            <webuijsf:staticText binding="#{RahnumaParameters.stxtDisclaimer1}" id="stxtDisclaimer1" style="font-size: 10px; padding-left: 3px" text="The University of Oxford does not guarantee the accuracy of any data nor the suitability of the software for any purpose."/>
                        </webuijsf:panelLayout>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
