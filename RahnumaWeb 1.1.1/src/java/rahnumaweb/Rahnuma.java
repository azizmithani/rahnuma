/*
 * Rahnuma.java
 *
 * Created on 29-Jan-2008, 21:20:35
 */
package rahnumaweb;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.AddRemove;
import com.sun.webui.jsf.component.Body;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.Form;
import com.sun.webui.jsf.component.Head;
import com.sun.webui.jsf.component.Html;
import com.sun.webui.jsf.component.Hyperlink;
import com.sun.webui.jsf.component.ImageComponent;
import com.sun.webui.jsf.component.Label;
import com.sun.webui.jsf.component.Link;
import com.sun.webui.jsf.component.Page;
import com.sun.webui.jsf.component.PanelGroup;
import com.sun.webui.jsf.component.PanelLayout;
import com.sun.webui.jsf.component.RadioButtonGroup;
import com.sun.webui.jsf.component.StaticText;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.model.MultipleSelectOptionsList;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import java.io.IOException;
import javax.faces.FacesException;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.context.ExternalContext;
import javax.faces.event.ValueChangeEvent;
import rahnumautilities.Parameter;
import rahnumautilities.Utilities;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @author mithani
 */
public class Rahnuma extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private Page page1 = new Page();

    public Page getPage1() {
        return page1;
    }

    public void setPage1(Page p) {
        this.page1 = p;
    }
    private Html html1 = new Html();

    public Html getHtml1() {
        return html1;
    }

    public void setHtml1(Html h) {
        this.html1 = h;
    }
    private Head head1 = new Head();

    public Head getHead1() {
        return head1;
    }

    public void setHead1(Head h) {
        this.head1 = h;
    }
    private Link link1 = new Link();

    public Link getLink1() {
        return link1;
    }

    public void setLink1(Link l) {
        this.link1 = l;
    }
    private Body body1 = new Body();

    public Body getBody1() {
        return body1;
    }

    public void setBody1(Body b) {
        this.body1 = b;
    }
    private Form form1 = new Form();

    public Form getForm1() {
        return form1;
    }

    public void setForm1(Form f) {
        this.form1 = f;
    }
    private Hyperlink hlAnalysis = new Hyperlink();

    public Hyperlink getHlAnalysis() {
        return hlAnalysis;
    }

    public void setHlAnalysis(Hyperlink h) {
        this.hlAnalysis = h;
    }
    private Label lblAnalysis = new Label();

    public Label getLblAnalysis() {
        return lblAnalysis;
    }

    public void setLblAnalysis(Label l) {
        this.lblAnalysis = l;
    }
    private PanelLayout loAnalysis = new PanelLayout();

    public PanelLayout getLoAnalysis() {
        return loAnalysis;
    }

    public void setLoAnalysis(PanelLayout pl) {
        this.loAnalysis = pl;
    }
    private RadioButtonGroup rbgAnalysis = new RadioButtonGroup();

    public RadioButtonGroup getRbgAnalysis() {
        return rbgAnalysis;
    }

    public void setRbgAnalysis(RadioButtonGroup rbg) {
        this.rbgAnalysis = rbg;
    }
    private PanelLayout loAnalysisOptions = new PanelLayout();

    public PanelLayout getLoAnalysisOptions() {
        return loAnalysisOptions;
    }

    public void setLoAnalysisOptions(PanelLayout pl) {
        this.loAnalysisOptions = pl;
    }
    private Label lblAnalysisOptions = new Label();

    public Label getLblAnalysisOptions() {
        return lblAnalysisOptions;
    }

    public void setLblAnalysisOptions(Label l) {
        this.lblAnalysisOptions = l;
    }
    private PanelLayout loAnalysisType = new PanelLayout();

    public PanelLayout getLoAnalysisType() {
        return loAnalysisType;
    }

    public void setLoAnalysisType(PanelLayout pl) {
        this.loAnalysisType = pl;
    }
    private Label lblAnalysisType = new Label();

    public Label getLblAnalysisType() {
        return lblAnalysisType;
    }

    public void setLblAnalysisType(Label l) {
        this.lblAnalysisType = l;
    }
    private Hyperlink hlAnalysisType = new Hyperlink();

    public Hyperlink getHlAnalysisType() {
        return hlAnalysisType;
    }

    public void setHlAnalysisType(Hyperlink h) {
        this.hlAnalysisType = h;
    }
    private RadioButtonGroup rbgAnalysisType = new RadioButtonGroup();

    public RadioButtonGroup getRbgAnalysisType() {
        return rbgAnalysisType;
    }

    public void setRbgAnalysisType(RadioButtonGroup rbg) {
        this.rbgAnalysisType = rbg;
    }
    private PanelLayout loAnalysisMode = new PanelLayout();

    public PanelLayout getLoAnalysisMode() {
        return loAnalysisMode;
    }

    public void setLoAnalysisMode(PanelLayout pl) {
        this.loAnalysisMode = pl;
    }
    private Label lblAnalysisMode = new Label();

    public Label getLblAnalysisMode() {
        return lblAnalysisMode;
    }

    public void setLblAnalysisMode(Label l) {
        this.lblAnalysisMode = l;
    }
    private Hyperlink hlAnalysisMode = new Hyperlink();

    public Hyperlink getHlAnalysisMode() {
        return hlAnalysisMode;
    }

    public void setHlAnalysisMode(Hyperlink h) {
        this.hlAnalysisMode = h;
    }
    private RadioButtonGroup rbgAnalysisMode = new RadioButtonGroup();

    public RadioButtonGroup getRbgAnalysisMode() {
        return rbgAnalysisMode;
    }

    public void setRbgAnalysisMode(RadioButtonGroup rbg) {
        this.rbgAnalysisMode = rbg;
    }
    private HtmlPanelGrid gpAnalysisOptions = new HtmlPanelGrid();

    public HtmlPanelGrid getGpAnalysisOptions() {
        return gpAnalysisOptions;
    }

    public void setGpAnalysisOptions(HtmlPanelGrid hpg) {
        this.gpAnalysisOptions = hpg;
    }
    private PanelLayout loJobSpecification = new PanelLayout();

    public PanelLayout getLoJobSpecification() {
        return loJobSpecification;
    }

    public void setLoJobSpecification(PanelLayout pl) {
        this.loJobSpecification = pl;
    }
    private PanelLayout loComparisonMode = new PanelLayout();

    public PanelLayout getLoComparisonMode() {
        return loComparisonMode;
    }

    public void setLoComparisonMode(PanelLayout pl) {
        this.loComparisonMode = pl;
    }
    private Label lblComparisonMode = new Label();

    public Label getLblComparisonMode() {
        return lblComparisonMode;
    }

    public void setLblComparisonMode(Label l) {
        this.lblComparisonMode = l;
    }
    private Hyperlink hlComparisonMode = new Hyperlink();

    public Hyperlink getHlComparisonMode() {
        return hlComparisonMode;
    }

    public void setHlComparisonMode(Hyperlink h) {
        this.hlComparisonMode = h;
    }
    private RadioButtonGroup rbgComparisonMode = new RadioButtonGroup();

    public RadioButtonGroup getRbgComparisonMode() {
        return rbgComparisonMode;
    }

    public void setRbgComparisonMode(RadioButtonGroup rbg) {
        this.rbgComparisonMode = rbg;
    }
    private PanelLayout loPhyloMode = new PanelLayout();

    public PanelLayout getLoPhyloMode() {
        return loPhyloMode;
    }

    public void setLoPhyloMode(PanelLayout pl) {
        this.loPhyloMode = pl;
    }
    private Label lblPhyloMode = new Label();

    public Label getLblPhyloMode() {
        return lblPhyloMode;
    }

    public void setLblPhyloMode(Label l) {
        this.lblPhyloMode = l;
    }
    private Hyperlink hlPhyloMode = new Hyperlink();

    public Hyperlink getHlPhyloMode() {
        return hlPhyloMode;
    }

    public void setHlPhyloMode(Hyperlink h) {
        this.hlPhyloMode = h;
    }
    private RadioButtonGroup rbgPhyloMode = new RadioButtonGroup();

    public RadioButtonGroup getRbgPhyloMode() {
        return rbgPhyloMode;
    }

    public void setRbgPhyloMode(RadioButtonGroup rbg) {
        this.rbgPhyloMode = rbg;
    }
    private PanelLayout loTitle = new PanelLayout();

    public PanelLayout getLoTitle() {
        return loTitle;
    }

    public void setLoTitle(PanelLayout pl) {
        this.loTitle = pl;
    }
    private ImageComponent imgTitle = new ImageComponent();

    public ImageComponent getImgTitle() {
        return imgTitle;
    }

    public void setImgTitle(ImageComponent ic) {
        this.imgTitle = ic;
    }
    private Button btnHelp = new Button();

    public Button getBtnHelp() {
        return btnHelp;
    }

    public void setBtnHelp(Button b) {
        this.btnHelp = b;
    }
    private Button btnAbout = new Button();

    public Button getBtnAbout() {
        return btnAbout;
    }

    public void setBtnAbout(Button b) {
        this.btnAbout = b;
    }
    private PanelLayout loPageNo = new PanelLayout();

    public PanelLayout getLoPageNo() {
        return loPageNo;
    }

    public void setLoPageNo(PanelLayout pl) {
        this.loPageNo = pl;
    }
    private StaticText stPageNo = new StaticText();

    public StaticText getStPageNo() {
        return stPageNo;
    }

    public void setStPageNo(StaticText st) {
        this.stPageNo = st;
    }
    private PanelLayout loJobDetail = new PanelLayout();

    public PanelLayout getLoJobDetail() {
        return loJobDetail;
    }

    public void setLoJobDetail(PanelLayout pl) {
        this.loJobDetail = pl;
    }
    private PanelLayout loJobDetailHeading = new PanelLayout();

    public PanelLayout getLoJobDetailHeading() {
        return loJobDetailHeading;
    }

    public void setLoJobDetailHeading(PanelLayout pl) {
        this.loJobDetailHeading = pl;
    }
    private StaticText stxtJobDetail = new StaticText();

    public StaticText getStxtJobDetail() {
        return stxtJobDetail;
    }

    public void setStxtJobDetail(StaticText st) {
        this.stxtJobDetail = st;
    }
    private PanelLayout loJobName = new PanelLayout();

    public PanelLayout getLoJobName() {
        return loJobName;
    }

    public void setLoJobName(PanelLayout pl) {
        this.loJobName = pl;
    }
    private PanelGroup gpJobName = new PanelGroup();

    public PanelGroup getGpJobName() {
        return gpJobName;
    }

    public void setGpJobName(PanelGroup pg) {
        this.gpJobName = pg;
    }
    private Label lblJobName = new Label();

    public Label getLblJobName() {
        return lblJobName;
    }

    public void setLblJobName(Label l) {
        this.lblJobName = l;
    }
    private Hyperlink hlJobName = new Hyperlink();

    public Hyperlink getHlJobName() {
        return hlJobName;
    }

    public void setHlJobName(Hyperlink h) {
        this.hlJobName = h;
    }
    private TextField txtJobName = new TextField();

    public TextField getTxtJobName() {
        return txtJobName;
    }

    public void setTxtJobName(TextField tf) {
        this.txtJobName = tf;
    }
    private StaticText stxtJobNameErrorMessage = new StaticText();

    public StaticText getStxtJobNameErrorMessage() {
        return stxtJobNameErrorMessage;
    }

    public void setStxtJobNameErrorMessage(StaticText st) {
        this.stxtJobNameErrorMessage = st;
    }
    private PanelLayout loEmail = new PanelLayout();

    public PanelLayout getLoEmail() {
        return loEmail;
    }

    public void setLoEmail(PanelLayout pl) {
        this.loEmail = pl;
    }
    private PanelGroup gpEmail = new PanelGroup();

    public PanelGroup getGpEmail() {
        return gpEmail;
    }

    public void setGpEmail(PanelGroup pg) {
        this.gpEmail = pg;
    }
    private Label lblEmail = new Label();

    public Label getLblEmail() {
        return lblEmail;
    }

    public void setLblEmail(Label l) {
        this.lblEmail = l;
    }
    private Hyperlink hlEmail = new Hyperlink();

    public Hyperlink getHlEmail() {
        return hlEmail;
    }

    public void setHlEmail(Hyperlink h) {
        this.hlEmail = h;
    }
    private TextField txtEmail = new TextField();

    public TextField getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(TextField tf) {
        this.txtEmail = tf;
    }
    private StaticText stxtEmailErrorMessage = new StaticText();

    public StaticText getStxtEmailErrorMessage() {
        return stxtEmailErrorMessage;
    }

    public void setStxtEmailErrorMessage(StaticText st) {
        this.stxtEmailErrorMessage = st;
    }
    private PanelLayout loJobSpecificationHeading = new PanelLayout();

    public PanelLayout getLoJobSpecificationHeading() {
        return loJobSpecificationHeading;
    }

    public void setLoJobSpecificationHeading(PanelLayout pl) {
        this.loJobSpecificationHeading = pl;
    }
    private StaticText stxtJobSpecification = new StaticText();

    public StaticText getStxtJobSpecification() {
        return stxtJobSpecification;
    }

    public void setStxtJobSpecification(StaticText st) {
        this.stxtJobSpecification = st;
    }
    private PanelLayout loOutputOptions = new PanelLayout();

    public PanelLayout getLoOutputOptions() {
        return loOutputOptions;
    }

    public void setLoOutputOptions(PanelLayout pl) {
        this.loOutputOptions = pl;
    }
    private Label llblOutputOptions = new Label();

    public Label getLlblOutputOptions() {
        return llblOutputOptions;
    }

    public void setLlblOutputOptions(Label l) {
        this.llblOutputOptions = l;
    }
    private PanelLayout loOutputType = new PanelLayout();

    public PanelLayout getLoOutputType() {
        return loOutputType;
    }

    public void setLoOutputType(PanelLayout pl) {
        this.loOutputType = pl;
    }
    private Label lblOutputType = new Label();

    public Label getLblOutputType() {
        return lblOutputType;
    }

    public void setLblOutputType(Label l) {
        this.lblOutputType = l;
    }
    private Hyperlink hlOutputType = new Hyperlink();

    public Hyperlink getHlOutputType() {
        return hlOutputType;
    }

    public void setHlOutputType(Hyperlink h) {
        this.hlOutputType = h;
    }
    private PanelLayout loOutputFormat = new PanelLayout();

    public PanelLayout getLoOutputFormat() {
        return loOutputFormat;
    }

    public void setLoOutputFormat(PanelLayout pl) {
        this.loOutputFormat = pl;
    }
    private Label lblOutputFormat = new Label();

    public Label getLblOutputFormat() {
        return lblOutputFormat;
    }

    public void setLblOutputFormat(Label l) {
        this.lblOutputFormat = l;
    }
    private Hyperlink hlOutputFormat = new Hyperlink();

    public Hyperlink getHlOutputFormat() {
        return hlOutputFormat;
    }

    public void setHlOutputFormat(Hyperlink h) {
        this.hlOutputFormat = h;
    }
    private RadioButtonGroup rbgOutputType = new RadioButtonGroup();

    public RadioButtonGroup getRbgOutputType() {
        return rbgOutputType;
    }

    public void setRbgOutputType(RadioButtonGroup rbg) {
        this.rbgOutputType = rbg;
    }
    private RadioButtonGroup rbgOutputFormat = new RadioButtonGroup();

    public RadioButtonGroup getRbgOutputFormat() {
        return rbgOutputFormat;
    }

    public void setRbgOutputFormat(RadioButtonGroup rbg) {
        this.rbgOutputFormat = rbg;
    }
    private PanelLayout loButtons = new PanelLayout();

    public PanelLayout getLoButtons() {
        return loButtons;
    }

    public void setLoButtons(PanelLayout pl) {
        this.loButtons = pl;
    }
    private Button btnNext = new Button();

    public Button getBtnNext() {
        return btnNext;
    }

    public void setBtnNext(Button b) {
        this.btnNext = b;
    }
    private HtmlPanelGrid gpOutputOptions = new HtmlPanelGrid();

    public HtmlPanelGrid getGpOutputOptions() {
        return gpOutputOptions;
    }

    public void setGpOutputOptions(HtmlPanelGrid hpg) {
        this.gpOutputOptions = hpg;
    }
    private Form frmHeader = new Form();

    public Form getFrmHeader() {
        return frmHeader;
    }

    public void setFrmHeader(Form f) {
        this.frmHeader = f;
    }
    private PanelLayout loDisclaimer = new PanelLayout();

    public PanelLayout getLoDisclaimer() {
        return loDisclaimer;
    }

    public void setLoDisclaimer(PanelLayout pl) {
        this.loDisclaimer = pl;
    }
    private StaticText stxtDisclaimer = new StaticText();

    public StaticText getStxtDisclaimer() {
        return stxtDisclaimer;
    }

    public void setStxtDisclaimer(StaticText st) {
        this.stxtDisclaimer = st;
    }
    private StaticText stxtDisclaimerLabel = new StaticText();

    public StaticText getStxtDisclaimerLabel() {
        return stxtDisclaimerLabel;
    }

    public void setStxtDisclaimerLabel(StaticText st) {
        this.stxtDisclaimerLabel = st;
    }
    private StaticText stxtFooter1 = new StaticText();

    public StaticText getStxtFooter1() {
        return stxtFooter1;
    }

    public void setStxtFooter1(StaticText st) {
        this.stxtFooter1 = st;
    }
    private Hyperlink hlStatistics = new Hyperlink();

    public Hyperlink getHlStatistics() {
        return hlStatistics;
    }

    public void setHlStatistics(Hyperlink h) {
        this.hlStatistics = h;
    }
    private StaticText stxtFooter2 = new StaticText();

    public StaticText getStxtFooter2() {
        return stxtFooter2;
    }

    public void setStxtFooter2(StaticText st) {
        this.stxtFooter2 = st;
    }
    private Hyperlink hlPlantsSciences = new Hyperlink();

    public Hyperlink getHlPlantsSciences() {
        return hlPlantsSciences;
    }

    public void setHlPlantsSciences(Hyperlink h) {
        this.hlPlantsSciences = h;
    }
    private StaticText stxtFooter3 = new StaticText();

    public StaticText getStxtFooter3() {
        return stxtFooter3;
    }

    public void setStxtFooter3(StaticText st) {
        this.stxtFooter3 = st;
    }
    private Hyperlink hlOxford = new Hyperlink();

    public Hyperlink getHlOxford() {
        return hlOxford;
    }

    public void setHlOxford(Hyperlink h) {
        this.hlOxford = h;
    }
    private PanelLayout loFooter = new PanelLayout();

    public PanelLayout getLoFooter() {
        return loFooter;
    }

    public void setLoFooter(PanelLayout pl) {
        this.loFooter = pl;
    }
    private PanelLayout loKEGGPathway = new PanelLayout();

    public PanelLayout getLoKEGGPathway() {
        return loKEGGPathway;
    }

    public void setLoKEGGPathway(PanelLayout pl) {
        this.loKEGGPathway = pl;
    }
    private Label lblDataset = new Label();

    public Label getLblDataset() {
        return lblDataset;
    }

    public void setLblDataset(Label l) {
        this.lblDataset = l;
    }
    private Hyperlink hlDataset = new Hyperlink();

    public Hyperlink getHlDataset() {
        return hlDataset;
    }

    public void setHlDataset(Hyperlink h) {
        this.hlDataset = h;
    }
    private PanelLayout loDatasetOptions = new PanelLayout();

    public PanelLayout getLoDatasetOptions() {
        return loDatasetOptions;
    }

    public void setLoDatasetOptions(PanelLayout pl) {
        this.loDatasetOptions = pl;
    }
    private PanelLayout loSelectDataset = new PanelLayout();

    public PanelLayout getLoSelectDataset() {
        return loSelectDataset;
    }

    public void setLoSelectDataset(PanelLayout pl) {
        this.loSelectDataset = pl;
    }
    private RadioButtonGroup rbgDatasetOptions = new RadioButtonGroup();

    public RadioButtonGroup getRbgDatasetOptions() {
        return rbgDatasetOptions;
    }

    public void setRbgDatasetOptions(RadioButtonGroup rbg) {
        this.rbgDatasetOptions = rbg;
    }
    private Label lblDatasetSubset = new Label();

    public Label getLblDatasetSubset() {
        return lblDatasetSubset;
    }

    public void setLblDatasetSubset(Label l) {
        this.lblDatasetSubset = l;
    }
    private DropDown drpDatasetSubset = new DropDown();

    public DropDown getDrpDatasetSubset() {
        return drpDatasetSubset;
    }

    public void setDrpDatasetSubset(DropDown dd) {
        this.drpDatasetSubset = dd;
    }
    private AddRemove arDataset = new AddRemove();

    public AddRemove getArDataset() {
        return arDataset;
    }

    public void setArDataset(AddRemove ar) {
        this.arDataset = ar;
    }
    private StaticText stxtDataset = new StaticText();

    public StaticText getStxtDataset() {
        return stxtDataset;
    }

    public void setStxtDataset(StaticText st) {
        this.stxtDataset = st;
    }
    private PanelLayout loDataset = new PanelLayout();

    public PanelLayout getLoDataset() {
        return loDataset;
    }

    public void setLoDataset(PanelLayout pl) {
        this.loDataset = pl;
    }
    private PanelLayout loDatasetHeading = new PanelLayout();

    public PanelLayout getLoDatasetHeading() {
        return loDatasetHeading;
    }

    public void setLoDatasetHeading(PanelLayout pl) {
        this.loDatasetHeading = pl;
    }
    private StaticText stxtDatasetHeading = new StaticText();

    public StaticText getStxtDatasetHeading() {
        return stxtDatasetHeading;
    }

    public void setStxtDatasetHeading(StaticText st) {
        this.stxtDatasetHeading = st;
    }
    private PanelGroup gpVersion = new PanelGroup();

    public PanelGroup getGpVersion() {
        return gpVersion;
    }

    public void setGpVersion(PanelGroup pg) {
        this.gpVersion = pg;
    }
    private StaticText stxtVersion = new StaticText();

    public StaticText getStxtVersion() {
        return stxtVersion;
    }

    public void setStxtVersion(StaticText st) {
        this.stxtVersion = st;
    }
    private PanelGroup gpTitle = new PanelGroup();

    public PanelGroup getGpTitle() {
        return gpTitle;
    }

    public void setGpTitle(PanelGroup pg) {
        this.gpTitle = pg;
    }

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public Rahnuma() {
    }

    /**
     * <p>Callback method that is called whenever a page is navigated to,
     * either directly via a URL, or indirectly via page navigation.
     * Customize this method to acquire resources that will be needed
     * for event handlers and lifecycle methods, whether or not this
     * page is performing post back processing.</p>
     * 
     * <p>Note that, if the current request is a postback, the property
     * values of the components do <strong>not</strong> represent any
     * values submitted with this request.  Instead, they represent the
     * property values that were saved for this view when it was rendered.</p>
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
            log("Rahnuma Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }

    // </editor-fold>
    // Perform application initialization that must complete
    // *after* managed components are initialized
    // TODO - add your own initialization code here
    }

    /**
     * <p>Callback method that is called after the component tree has been
     * restored, but before any event processing takes place.  This method
     * will <strong>only</strong> be called on a postback request that
     * is processing a form submit.  Customize this method to allocate
     * resources that will be required in your event handlers.</p>
     */
    @Override
    public void preprocess() {
    }

    /**
     * <p>Callback method that is called just before rendering takes place.
     * This method will <strong>only</strong> be called for the page that
     * will actually be rendered (and not, for example, on a page that
     * handled a postback and then navigated to a different page).  Customize
     * this method to allocate resources that will be required for rendering
     * this page.</p>
     */
    @Override
    public void prerender() {
        SessionBean1 sb = getSessionBean1();

        ExternalContext externalContext = getFacesContext().getExternalContext();
        String startPageURL = externalContext.getRequestContextPath() +
                "/faces/" + getApplicationBean1().getStartPage();
        boolean redirect = false;
        if (sb == null || sb.getDatabase() == null || sb.getDatabase().getConnection() == null || sb.getDatabase().suspendWebInterface())
            redirect = true;
        else if (!getSessionBean1().isValidLogin())
            redirect = true;
        if (redirect) {
            try {
                externalContext.redirect(startPageURL);
            } catch (IOException ex) {
                Utilities.printStackTrace(getSessionBean1().getDatabase().getApplicationParameters().getOutLogs(), ex);
            }
            return;
        }

        getStxtJobNameErrorMessage().setVisible(jobNameError);
        jobNameError = false;

        getStxtEmailErrorMessage().setVisible(emailError);
        emailError = false;
        
        // show select dataset panel only if required
        boolean showSelectDatasetPanel = getSessionBean1().getSelectedOptionDataset().equals(Parameter.OPTION_DATASET_OPTION_SELECT);
        getLblDatasetSubset().setVisible(showSelectDatasetPanel);
        getDrpDatasetSubset().setVisible(showSelectDatasetPanel);
        getArDataset().setVisible(showSelectDatasetPanel);
        getStxtDataset().setVisible(showSelectDatasetPanel);
        
        refreshAnalysisOptions();
        
        // help text
        setHelpTexts();
    }
    private boolean jobNameError = false;
    private boolean emailError = false;
    private boolean datasetError = false;

    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called (regardless of whether
     * or not this was the page that was actually rendered).  Customize this
     * method to release resources acquired in the <code>init()</code>,
     * <code>preprocess()</code>, or <code>prerender()</code> methods (or
     * acquired during execution of an event handler).</p>
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

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    public void rbgAnalysis_processValueChange(ValueChangeEvent vce) {
        
        // save the selected analysis 
        getSessionBean1().setSelectedAnalysis((String) rbgAnalysis.getSelected());
        // refresh analysis options
        refreshAnalysisOptions();

    }

    public void rbgAnalysisType_processValueChange(ValueChangeEvent vce) {
        // save the selected analysis type
        getSessionBean1().setSelectedAnalysisType((String) rbgAnalysisType.getSelected());
        // refresh analysis options
        refreshAnalysisOptions();

    }

    public void rbgAnalysisMode_processValueChange(ValueChangeEvent vce) {
        // save the selected analysis mode
        getSessionBean1().setSelectedAnalysisMode((String) rbgAnalysisMode.getSelected());
        // refresh analysis options
        refreshAnalysisOptions();
    }

    private void refreshAnalysisOptions() {
        // Get the session bean
        SessionBean1 sb = getSessionBean1();
        // refresh analysis options
        new WebController().refreshAnalysisOptions(sb);

        // enable comparison mode only for the comparative analysis
        boolean comparativeAnalysis = sb.getSelectedAnalysis().equals(Parameter.OPTION_ANALYSIS_COMPARATIVE);
//        getRbgComparisonMode().setDisabled( !comparativeAnalysis );
        getRbgComparisonMode().setVisible(comparativeAnalysis);
        getLblComparisonMode().setVisible(comparativeAnalysis);
        getHlComparisonMode().setVisible(comparativeAnalysis);

        // set the comparison mode value to null if analysis is not comparative
        getRbgComparisonMode().setSelected(comparativeAnalysis ? sb.getSelectedComparisonMode() : null);

        // enable phylogenetic mode only for pathway analysis and phylogeny based comparative analysis only
        boolean phyloAnalysis = comparativeAnalysis && sb.getSelectedAnalysisMode().equals(Parameter.OPTION_ANALYSIS_MODE_PHYLOGENY);
        phyloAnalysis = phyloAnalysis || (sb.getSelectedAnalysis().equals(Parameter.OPTION_ANALYSIS_PATHWAY));
//        getRbgPhyloMode().setDisabled( !phyloAnalysis );
        getRbgPhyloMode().setVisible(phyloAnalysis);
        getLblPhyloMode().setVisible(phyloAnalysis);
        getHlPhyloMode().setVisible(phyloAnalysis);

        // set the phylogenetic mode value to null if analysis is not pathway analysis or phylogeny based comparative analysis
        getRbgPhyloMode().setSelected(phyloAnalysis ? sb.getSelectedPhylogeneticMode() : null);

        // hide analysis mode if the analysis type is "all but one comparison"
        boolean allButOneComparison = sb.getSelectedAnalysisType().equals(Parameter.OPTION_ANALYSIS_TYPE_ALL_BUT_ONE);
        if (comparativeAnalysis && allButOneComparison) {
            sb.setSelectedAnalysisMode(Parameter.OPTION_ANALYSIS_MODE_ORGANISM);
            getRbgAnalysisMode().setSelected(sb.getSelectedAnalysisMode());
        }
//        getRbgAnalysisMode().setDisabled(comparativeAnalysis && allButOneComparison);
        getRbgAnalysisMode().setVisible(!(comparativeAnalysis && allButOneComparison));
        getLblAnalysisMode().setVisible(!(comparativeAnalysis && allButOneComparison));
        getHlAnalysisMode().setVisible(!(comparativeAnalysis && allButOneComparison));
    }

    public String btnNext_action() {
        jobNameError = getSessionBean1().getJobName().isEmpty();
        emailError = getSessionBean1().getEmail().isEmpty();
        datasetError = validateDataset();

        if (jobNameError || emailError || datasetError) {
            return null;
        }

        WebController controller = new WebController();
        controller.getParameterPageData(getSessionBean1());
        controller.initialiseParametersPage(getSessionBean1());
        return "Parameters";
    }

    private boolean validateDataset() {
        SessionBean1 sb = getSessionBean1();
//        System.out.println(sb.getSelectedOptionDataset());
        if (sb.getSelectedOptionDataset().equals(Parameter.OPTION_DATASET_OPTION_SELECT)) {
//            sb.setSelectedDataset((String[]) getArDataset().getSelected());
//            System.out.println(Integer.toString(sb.getSelectedDataset().length));
            if (!(new WebController()).validateDataset(sb.getSelectedDataset())) {
                getStxtDataset().setText("At least one pathway map must be selected.");
                return true;
            } else {
                getStxtDataset().setText(null);
                return false;
            }
        } else {
            getStxtDataset().setText(null);
            return false;
        }
    }
    
    public String btnHelp_action() {
        // TODO: Replace with your code
        return null;
    }

    public String btnAbout_action() {
        // TODO: Replace with your code
        return null;
    }

    public String hlJobName_action() {
        // TODO: Replace with your code
        return null;
    }

    public String hlEmail_action() {
        // TODO: Replace with your code
        return null;
    }

    public String hlAnalysis_action() {
        // TODO: Replace with your code
        return null;
    }

    public String hlAnalysisType_action() {
        // TODO: Replace with your code
        return null;
    }

    public String hlAnalysisMode_action() {
        // TODO: Replace with your code
        return null;
    }

    public String hlComparisonMode_action() {
        // TODO: Replace with your code
        return null;
    }

    public String hlPhyloMode_action() {
        // TODO: Replace with your code
        return null;
    }

    public String hlOutputType_action() {
        // TODO: Replace with your code
        return null;
    }

    public String hlOutputFormat_action() {
        // TODO: Replace with your code
        return null;
    }
    
    private void setHelpTexts() {
        SessionBean1 sb = getSessionBean1();
        new WebController().setHelpTextsMainPage(sb);
    }

    public void drpDatasetSubset_processValueChange(ValueChangeEvent event) {
        getSessionBean1().setSelectedDatasetSubset(getDrpDatasetSubset().getSelected().toString());
        String[] selectedDataset = (String[]) getArDataset().getSelected();
        if (selectedDataset == null) {
            selectedDataset = new String[]{};
        }
        getSessionBean1().setSelectedDataset(selectedDataset);
        // refresh the dataset
        (new WebController()).refreshDataset(getSessionBean1());
    }

    public void rbgDatasetOptions_processValueChange(ValueChangeEvent vce) {
        // save the selected dataset option 
        getSessionBean1().setSelectedOptionDataset((String) rbgDatasetOptions.getSelected());
    }
            
}


