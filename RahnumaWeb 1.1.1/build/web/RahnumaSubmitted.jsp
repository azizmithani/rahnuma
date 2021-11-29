<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{RahnumaSubmitted.page1}" id="page1">
            <webuijsf:html binding="#{RahnumaSubmitted.html1}" id="html1">
                <webuijsf:head binding="#{RahnumaSubmitted.head1}" id="head1" title="Rahnuma: Pathway Analysis and Network Comparison Tool">
                    <webuijsf:link binding="#{RahnumaSubmitted.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{RahnumaSubmitted.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{RahnumaSubmitted.form1}" id="form1">
                        <webuijsf:staticText binding="#{RahnumaSubmitted.staticText1}" id="staticText1"
                            style="font-size: 12px; height: 68px; left: 16px; top: 96px; position: absolute; width: 738px" text="Your job has been added to the queue. You'll be sent an email once the job is finished. Please do not submit another job until your current job is finished."/>
                        <webuijsf:button actionExpression="#{RahnumaSubmitted.btnRestart_action}" binding="#{RahnumaSubmitted.btnRestart}" id="btnRestart"
                            primary="true" style="font-size: 12px; left: 303px; top: 248px; position: absolute; text-align: center; width: 15mm" text="Restart"/>
                        <webuijsf:panelLayout binding="#{RahnumaSubmitted.loTitle}" id="loTitle" panelLayout="flow" style="height: 42px; left: 28px; top: 24px; position: absolute; text-align: center; vertical-align: middle; width: 700px">
                            <webuijsf:panelGroup binding="#{RahnumaSubmitted.gpTtitle}" id="gpTtitle">
                                <webuijsf:image align="bottom" binding="#{RahnumaSubmitted.imgTitle}" id="imgTitle" style="margin-right: 1%" url="/resources/title.JPG"/>
                                <webuijsf:button actionExpression="#{RahnumaSubmitted.btnAbout_action}" binding="#{RahnumaSubmitted.btnAbout}" id="btnAbout"
                                    mini="true" onClick="window.open(&quot;about.html&quot;);&#xa;return false;"
                                    style="font-size: 12px; margin-bottom: 0.6%; text-align: center; width: 48px" text="About"/>
                            </webuijsf:panelGroup>
                            <webuijsf:panelGroup binding="#{RahnumaSubmitted.gpVersion}" block="true" id="gpVersion" style="margin-right: 60px">
                                <webuijsf:staticText binding="#{RahnumaSubmitted.stxtVersion}" id="stxtVersion" style="font-size: 12px; font-weight: bold" text="#{ApplicationBean1.version}"/>
                            </webuijsf:panelGroup>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout binding="#{RahnumaSubmitted.loFooter1}" id="loFooter1" style="margin-top: 50px; margin-bottom: 0px; left: 0px; top: 310px; position: absolute; text-align: center; width: 700px; -rave-layout: grid">
                            <webuijsf:staticText binding="#{RahnumaSubmitted.stxtFooter1}" id="stxtFooter1" style="font-size: 10px;" text="A joint project between"/>
                            <webuijsf:hyperlink binding="#{RahnumaSubmitted.hlStatistics1}" id="hlStatistics1" style="font-size: 10px; padding-left: 2px"
                                target="_blank" text="Department of Statistics" url="http://www.stats.ox.ac.uk"/>
                            <webuijsf:staticText binding="#{RahnumaSubmitted.stxtFooter2}" id="stxtFooter2" style="font-size: 10px" text=" and"/>
                            <webuijsf:hyperlink binding="#{RahnumaSubmitted.hlPlantsSciences1}" id="hlPlantsSciences1"
                                style="font-size: 10px; padding-left: 2px" target="_blank" text="Department of Plant Sciences" url="http://www.plants.ox.ac.uk"/>
                            <webuijsf:staticText binding="#{RahnumaSubmitted.stxtFooter3}" id="stxtFooter3" style="font-size: 10px" text=","/>
                            <webuijsf:hyperlink binding="#{RahnumaSubmitted.hlOxford1}" id="hlOxford1" style="font-size: 10px; padding-left: 2px"
                                target="_blank" text="University of Oxford" url="http://www.ox.ac.uk"/>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout binding="#{RahnumaSubmitted.loDisclaimer1}" id="loDisclaimer1" style="margin-top: 2px; margin-bottom: 50px; left: 0px; top: 374px; position: absolute; text-align: center; width: 700px; -rave-layout: grid">
                            <webuijsf:staticText binding="#{RahnumaSubmitted.stxtDisclaimerLabel1}" id="stxtDisclaimerLabel1"
                                style="font-size: 10px; font-weight: bold" text="Disclaimer:"/>
                            <webuijsf:staticText binding="#{RahnumaSubmitted.stxtDisclaimer1}" id="stxtDisclaimer1" style="font-size: 10px; padding-left: 3px" text="The University of Oxford does not guarantee the accuracy of any data nor the suitability of the software for any purpose."/>
                        </webuijsf:panelLayout>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
