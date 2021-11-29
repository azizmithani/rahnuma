<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{RahnumaLogin.page1}" id="page1">
            <webuijsf:html binding="#{RahnumaLogin.html1}" id="html1">
                <webuijsf:head binding="#{RahnumaLogin.head1}" id="head1" title="Rahnuma: Pathway Analysis and Network Comparison Tool">
                    <webuijsf:link binding="#{RahnumaLogin.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{RahnumaLogin.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{RahnumaLogin.form1}" id="form1">
                        <webuijsf:textField binding="#{RahnumaLogin.txtUserId}" id="txtUserId" style="left: 276px; top: 144px; position: absolute"/>
                        <webuijsf:passwordField binding="#{RahnumaLogin.txtPassword}" id="txtPassword" style="left: 276px; top: 176px; position: absolute"/>
                        <webuijsf:label binding="#{RahnumaLogin.label1}" id="label1" style="left: 220px; top: 148px; position: absolute" text="User Id:"/>
                        <webuijsf:label binding="#{RahnumaLogin.label2}" id="label2" style="left: 204px; top: 180px; position: absolute" text="Password:"/>
                        <webuijsf:staticText binding="#{RahnumaLogin.staticText1}" id="staticText1"
                            style="font-size: 12px; height: 38px; left: 4px; top: 88px; position: absolute; width: 738px" text="Please enter the user id and password in order to access Rahnuma. If you don't have a user id and would like to use Rahnuma, please contact Aziz Mithani at mithani [at] stats [dot] ox [dot] ac [dot] uk."/>
                        <webuijsf:button actionExpression="#{RahnumaLogin.btnLogin_action}" binding="#{RahnumaLogin.btnLogin}" id="btnLogin" primary="true"
                            style="font-size: 12px; left: 311px; top: 236px; position: absolute; text-align: center; width: 15mm" text="Login"/>
                        <webuijsf:staticText binding="#{RahnumaLogin.stxtInvalidLogin}" id="stxtInvalidLogin"
                            style="color: rgb(204, 0, 0); height: 12px; left: 276px; top: 200px; position: absolute; width: 216px" text="Invalid User Id/Password."/>
                        <webuijsf:panelLayout binding="#{RahnumaLogin.loTitle}" id="loTitle" panelLayout="flow" style="height: 42px; left: 20px; top: 20px; position: absolute; text-align: center; vertical-align: middle; width: 700px">
                            <webuijsf:panelGroup binding="#{RahnumaLogin.gpTtitle}" id="gpTtitle">
                                <webuijsf:image align="bottom" binding="#{RahnumaLogin.imgTitle}" id="imgTitle" style="margin-right: 1%" url="/resources/title.JPG"/>
                                <webuijsf:button actionExpression="#{RahnumaLogin.btnAbout_action}" binding="#{RahnumaLogin.btnAbout}" id="btnAbout" mini="true"
                                    onClick="window.open(&quot;about.html&quot;);&#xa;return false;"
                                    style="font-size: 12px; margin-bottom: 0.6%; text-align: center; width: 48px" text="About"/>
                            </webuijsf:panelGroup>
                            <webuijsf:panelGroup binding="#{RahnumaLogin.gpVersion}" block="true" id="gpVersion" style="margin-right: 60px">
                                <webuijsf:staticText binding="#{RahnumaLogin.stxtVersion}" id="stxtVersion" style="font-size: 12px; font-weight: bold" text="#{ApplicationBean1.version}"/>
                            </webuijsf:panelGroup>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout binding="#{RahnumaLogin.loTutorial}" id="loTutorial" panelLayout="flow" style="height: 22px; left: 4px; top: 268px; position: absolute; width: 558px">
                            <webuijsf:staticText binding="#{RahnumaLogin.stxtNew}" id="stxtNew" style="color: red; font-size: 14px; font-weight: bold" text="New:"/>
                            <webuijsf:staticText binding="#{RahnumaLogin.stxttutorials}" id="stxttutorials" style="font-size: 12px" text="Some worked examples are  available on the "/>
                            <webuijsf:hyperlink actionExpression="#{RahnumaLogin.hlTutorials_action}" binding="#{RahnumaLogin.hlTutorials}" id="hlTutorials"
                                style="font-size: 12px" target="_blank" text="tutorial page" url="tutorials.html"/>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout binding="#{RahnumaLogin.loFooter}" id="loFooter" style="margin-top: 50px; margin-bottom: 0px; left: 0px; top: 384px; position: absolute; text-align: center; width: 700px; -rave-layout: grid">
                            <webuijsf:staticText binding="#{RahnumaLogin.stxtFooter1}" id="stxtFooter1" style="font-size: 10px;" text="A joint project between"/>
                            <webuijsf:hyperlink binding="#{RahnumaLogin.hlStatistics}" id="hlStatistics" style="font-size: 10px; padding-left: 2px"
                                target="_blank" text="Department of Statistics" url="http://www.stats.ox.ac.uk"/>
                            <webuijsf:staticText binding="#{RahnumaLogin.stxtFooter2}" id="stxtFooter2" style="font-size: 10px" text=" and"/>
                            <webuijsf:hyperlink binding="#{RahnumaLogin.hlPlantsSciences}" id="hlPlantsSciences" style="font-size: 10px; padding-left: 2px"
                                target="_blank" text="Department of Plant Sciences" url="http://www.plants.ox.ac.uk"/>
                            <webuijsf:staticText binding="#{RahnumaLogin.stxtFooter3}" id="stxtFooter3" style="font-size: 10px" text=","/>
                            <webuijsf:hyperlink binding="#{RahnumaLogin.hlOxford}" id="hlOxford" style="font-size: 10px; padding-left: 2px" target="_blank"
                                text="University of Oxford" url="http://www.ox.ac.uk"/>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout binding="#{RahnumaLogin.loDisclaimer}" id="loDisclaimer" style="margin-top: 2px; margin-bottom: 50px; left: 0px; top: 446px; position: absolute; text-align: center; width: 700px; -rave-layout: grid">
                            <webuijsf:staticText binding="#{RahnumaLogin.stxtDisclaimerLabel}" id="stxtDisclaimerLabel"
                                style="font-size: 10px; font-weight: bold" text="Disclaimer:"/>
                            <webuijsf:staticText binding="#{RahnumaLogin.stxtDisclaimer}" id="stxtDisclaimer" style="font-size: 10px; padding-left: 3px" text="The University of Oxford does not guarantee the accuracy of any data nor the suitability of the software for any purpose."/>
                        </webuijsf:panelLayout>
                        <webuijsf:panelLayout binding="#{RahnumaLogin.loUpdate}" id="loUpdate" panelLayout="flow" style="margin-top: 50px; margin-bottom: 0px; left: 4px; top: 302px; position: absolute; text-align: left; width: 700px; -rave-layout: grid">
                            <webuijsf:staticText binding="#{RahnumaLogin.stxtUpdate}" id="stxtUpdate" style="font-size: 12px;" text="Database last updated from KEGG on "/>
                            <webuijsf:staticText binding="#{RahnumaLogin.stxtUpdateDate}" id="stxtUpdateDate" style="font-size: 12px" text="#{SessionBean1.DBUpdateDate}"/>
                        </webuijsf:panelLayout>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
