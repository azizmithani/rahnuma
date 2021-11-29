<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{RahnumaStart.page1}" id="page1">
            <webuijsf:html binding="#{RahnumaStart.html1}" id="html1">
                <webuijsf:head binding="#{RahnumaStart.head1}" id="head1" title="Rahnuma: Pathway Analysis and Network Comparison Tool">
                    <webuijsf:link binding="#{RahnumaStart.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{RahnumaStart.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{RahnumaStart.form1}" id="form1">
                        <webuijsf:staticText binding="#{RahnumaStart.staticText1}" id="staticText1"
                            style="font-size: 12px; height: 54px; left: 4px; top: 100px; position: absolute; width: 738px" text="Rahnuma is a tool for prediction and analysis of metabolic pathways and comparison of metabolic networks that represents metabolic networks as hypergraphs and computes all possible pathways between two or more metabolites. The name Rahnuma comes from the Urdu language and literally means “someone who guides through the path”. To begin using Rahnuma, click the button below."/>
                        <webuijsf:button actionExpression="#{RahnumaStart.btnStart_action}" binding="#{RahnumaStart.btnStart}" id="btnStart" primary="true"
                            style="font-size: 12px; left: 295px; top: 188px; position: absolute; text-align: center; width: 25mm; z-index: 501" text="Start Rahnuma"/>
                        <webuijsf:panelLayout binding="#{RahnumaStart.loTitle}" id="loTitle" panelLayout="flow" style="height: 42px; left: 28px; top: 24px; position: absolute; text-align: center; vertical-align: middle; width: 700px">
                            <webuijsf:panelGroup binding="#{RahnumaStart.gpTitle}" block="true" id="gpTitle" style="vertical-align: middle; width = 700px">
                                <webuijsf:image align="top" binding="#{RahnumaStart.imgTitle}" id="imgTitle" style="margin-right: 1%" url="/resources/title.JPG"/>
                                <webuijsf:button actionExpression="#{RahnumaStart.btnAbout_action}" alt="About" binding="#{RahnumaStart.btnAbout}" id="btnAbout"
                                    onClick="window.open(&quot;about.html&quot;);&#xa;return false;"
                                    style="font-size: 12px; margin-bottom: 0.6%; text-align: center; width: 15mm" text="About"/>
                            </webuijsf:panelGroup>
                            <webuijsf:panelGroup binding="#{RahnumaStart.gpVersion}" id="gpVersion" style="margin-right: 60px">
                                <webuijsf:staticText binding="#{RahnumaStart.stxtVersion}" id="stxtVersion" style="font-size: 12px; font-weight: bold" text="#{ApplicationBean1.version}"/>
                            </webuijsf:panelGroup>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout binding="#{RahnumaStart.loTutorial}" id="loTutorial" panelLayout="flow" style="height: 22px; left: 4px; top: 244px; position: absolute; width: 558px">
                            <webuijsf:staticText binding="#{RahnumaStart.stxttutorials}" id="stxttutorials" style="font-size: 12px" text="Some worked examples are  available on the "/>
                            <webuijsf:hyperlink actionExpression="#{RahnumaStart.hlTutorials_action}" binding="#{RahnumaStart.hlTutorials}" id="hlTutorials"
                                style="font-size: 12px" target="_blank" text="tutorial page" url="tutorials.html"/>
                            <webuijsf:staticText binding="#{RahnumaStart.stxttutorials1}" id="stxttutorials1" style="font-size: 12px" text="."/>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout binding="#{RahnumaStart.loProjectDescription}" id="loProjectDescription" panelLayout="flow" style="margin-top: 50px; margin-bottom: 0px; left: 4px; top: 250px; position: absolute; text-align: left; width: 738px; -rave-layout: grid">
                            <webuijsf:staticText binding="#{RahnumaStart.stxtDescription1}" id="stxtDescription1" style="font-size: 12px" text="Rahnuma is a joint project between "/>
                            <webuijsf:hyperlink actionExpression="#{RahnumaStart.hlHeinGroup_action}" binding="#{RahnumaStart.hlHeinGroup}" id="hlHeinGroup"
                                style="font-size: 12px; padding-left: 2px;  padding-right: 2px" target="_blank" text="Hein Group" url="http://www.stats.ox.ac.uk/research/genome"/>
                            <webuijsf:staticText binding="#{RahnumaStart.stxtDescription2}" id="stxtDescription2" style="font-size: 12px" text=" from "/>
                            <webuijsf:hyperlink actionExpression="#{RahnumaStart.hlStatistics_action}" binding="#{RahnumaStart.hlStatistics}" id="hlStatistics"
                                style="font-size: 12px; padding-left: 2px" target="_blank" text="Department of Statistics" url="http://www.stats.ox.ac.uk"/>
                            <webuijsf:staticText binding="#{RahnumaStart.stxtDescription3}" id="stxtDescription3" style="font-size: 12px" text=" and "/>
                            <webuijsf:hyperlink actionExpression="#{RahnumaStart.hlPrestonGroup_action}" binding="#{RahnumaStart.hlPrestonGroup}"
                                id="hlPrestonGroup" style="font-size: 12px; padding-left: 2px" target="_blank" text="Preston Group" url="http://dps.plants.ox.ac.uk/plants/staff/GailPreston.aspx"/>
                            <webuijsf:staticText binding="#{RahnumaStart.stxtDescription9}" id="stxtDescription9" style="font-size: 12px" text=" from "/>
                            <webuijsf:hyperlink actionExpression="#{RahnumaStart.hlPlantsSciences_action}" binding="#{RahnumaStart.hlPlantsSciences}"
                                id="hlPlantsSciences" style="font-size: 12px; padding-left: 2px" target="_blank" text="Department of Plant Sciences" url="http://www.plants.ox.ac.uk"/>
                            <webuijsf:staticText binding="#{RahnumaStart.stxtDescription4}" id="stxtDescription4" style="font-size: 12px" text=" at the "/>
                            <webuijsf:hyperlink actionExpression="#{RahnumaStart.hlOxford_action}" binding="#{RahnumaStart.hlOxford}" id="hlOxford"
                                style="font-size: 12px; padding-left: 2px" target="_blank" text="University of Oxford" url="http://www.ox.ac.uk"/>
                            <webuijsf:staticText binding="#{RahnumaStart.stxtDescription5}" id="stxtDescription5" style="font-size: 12px" text=" and is being developed as a part of "/>
                            <webuijsf:hyperlink actionExpression="#{RahnumaStart.hlMithani_action}" binding="#{RahnumaStart.hlMithani}" id="hlMithani"
                                style="font-size: 12px; padding-left: 2px;  padding-right: 2px" target="_blank" text="Aziz Mithani" url="http://www.stats.ox.ac.uk/%7Emithani/"/>
                            <webuijsf:staticText binding="#{RahnumaStart.stxtDescription6}" id="stxtDescription6" style="font-size: 12px" text="'s doctoral studies. For enquiries or comments/suggestions relating to Rahnuma project, please contact Aziz Mithani at "/>
                            <webuijsf:staticText binding="#{RahnumaStart.stxtDescription7}" id="stxtDescription7" style="font-size: 12px; font-weight: bold" text=" mithani [at] stats [dot] ox [dot] ac [dot] uk."/>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout binding="#{RahnumaStart.loUpdate}" id="loUpdate" panelLayout="flow" style="margin-top: 50px; margin-bottom: 0px; left: 4px; top: 418px; position: absolute; text-align: left; width: 700px; -rave-layout: grid">
                            <webuijsf:staticText binding="#{RahnumaStart.stxtUpdate}" id="stxtUpdate" style="font-size: 12px;" text="Database last updated from KEGG on "/>
                            <webuijsf:staticText binding="#{RahnumaStart.stxtUpdateDate}" id="stxtUpdateDate" style="font-size: 12px" text="#{SessionBean1.DBUpdateDate}"/>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout binding="#{RahnumaStart.loFooter}" id="loFooter" style="margin-top: 50px; margin-bottom: 0px; left: 0px; top: 498px; position: absolute; text-align: center; width: 700px; -rave-layout: grid">
                            <webuijsf:staticText binding="#{RahnumaStart.stxtFooter1}" id="stxtFooter1" style="font-size: 10px;" text="A joint project between"/>
                            <webuijsf:hyperlink actionExpression="#{RahnumaStart.hlStatistics1_action}" binding="#{RahnumaStart.hlStatistics1}"
                                id="hlStatistics1" style="font-size: 10px; padding-left: 2px" target="_blank" text="Department of Statistics" url="http://www.stats.ox.ac.uk"/>
                            <webuijsf:staticText binding="#{RahnumaStart.stxtFooter2}" id="stxtFooter2" style="font-size: 10px" text=" and"/>
                            <webuijsf:hyperlink actionExpression="#{RahnumaStart.hlPlantsSciences1_action}" binding="#{RahnumaStart.hlPlantsSciences1}"
                                id="hlPlantsSciences1" style="font-size: 10px; padding-left: 2px" target="_blank" text="Department of Plant Sciences" url="http://www.plants.ox.ac.uk"/>
                            <webuijsf:staticText binding="#{RahnumaStart.stxtFooter3}" id="stxtFooter3" style="font-size: 10px" text=","/>
                            <webuijsf:hyperlink actionExpression="#{RahnumaStart.hlOxford1_action}" binding="#{RahnumaStart.hlOxford1}" id="hlOxford1"
                                style="font-size: 10px; padding-left: 2px" target="_blank" text="University of Oxford" url="http://www.ox.ac.uk"/>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout binding="#{RahnumaStart.loDisclaimer}" id="loDisclaimer" style="margin-top: 2px; margin-bottom: 50px; left: 0px; top: 562px; position: absolute; text-align: center; width: 700px; -rave-layout: grid">
                            <webuijsf:staticText binding="#{RahnumaStart.stxtDisclaimerLabel1}" id="stxtDisclaimerLabel1"
                                style="font-size: 10px; font-weight: bold" text="Disclaimer:"/>
                            <webuijsf:staticText binding="#{RahnumaStart.stxtDisclaimer}" id="stxtDisclaimer" style="font-size: 10px; padding-left: 3px" text="The University of Oxford does not guarantee the accuracy of any data nor the suitability of the software for any purpose."/>
                        </webuijsf:panelLayout>
                        <webuijsf:staticText binding="#{RahnumaStart.stxtCitation}" id="stxtCitation"
                            style="font-size: 12px; left: 4px; top: 376px; position: absolute" text="Please cite the following article when using Rahnuma:"/>
                        <webuijsf:staticText binding="#{RahnumaStart.stxtServerDown}" id="stxtServerDown"
                            style="color: red; font-size: 14px; height: 20px; left: 104px; top: 184px; position: absolute; text-align: center; width: 482px; z-index: 500" text="Rahnuma is currently down for maintenance. Please come back later."/>
                        <webuijsf:staticText binding="#{RahnumaStart.stxtCitationList}" id="stxtCitationList"
                            style="font-size: 12px; left: 28px; top: 400px; position: absolute; width: 716px" text="Mithani, A., Preston, G.M. and Hein, J. (2009) Rahnuma: Hypergraph based tool for metabolic pathway prediction and network comparison. Bioinformatics 25(14):1831-1832."/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
