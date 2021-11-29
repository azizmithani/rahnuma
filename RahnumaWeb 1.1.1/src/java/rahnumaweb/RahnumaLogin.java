/*
 * RahnumaLogin.java
 *
 * Created on 14 January 2008, 11:49
 * Copyright mithani
 */
package rahnumaweb;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Body;
import com.sun.webui.jsf.component.Button;
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
import com.sun.webui.jsf.component.PasswordField;
import com.sun.webui.jsf.component.StaticText;
import com.sun.webui.jsf.component.TextField;
import javax.faces.FacesException;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class RahnumaLogin extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private int __placeholder;
    
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

    private TextField txtUserId = new TextField();

    public TextField getTxtUserId() {
        return txtUserId;
    }

    public void setTxtUserId(TextField tf) {
        this.txtUserId = tf;
    }

    private PasswordField txtPassword = new PasswordField();

    public PasswordField getTxtPassword() {
        return txtPassword;
    }

    public void setTxtPassword(PasswordField pf) {
        this.txtPassword = pf;
    }

    private Label label1 = new Label();

    public Label getLabel1() {
        return label1;
    }

    public void setLabel1(Label l) {
        this.label1 = l;
    }

    private Label label2 = new Label();

    public Label getLabel2() {
        return label2;
    }

    public void setLabel2(Label l) {
        this.label2 = l;
    }

    private StaticText staticText1 = new StaticText();

    public StaticText getStaticText1() {
        return staticText1;
    }

    public void setStaticText1(StaticText st) {
        this.staticText1 = st;
    }

    private Button btnLogin = new Button();

    public Button getBtnLogin() {
        return btnLogin;
    }

    public void setBtnLogin(Button b) {
        this.btnLogin = b;
    }

    private StaticText stxtInvalidLogin = new StaticText();

    public StaticText getStxtInvalidLogin() {
        return stxtInvalidLogin;
    }

    public void setStxtInvalidLogin(StaticText st) {
        this.stxtInvalidLogin = st;
    }

    private Hyperlink hlTutorials = new Hyperlink();

    public Hyperlink getHlTutorials() {
        return hlTutorials;
    }

    public void setHlTutorials(Hyperlink h) {
        this.hlTutorials = h;
    }

    private StaticText stxttutorials = new StaticText();

    public StaticText getStxttutorials() {
        return stxttutorials;
    }

    public void setStxttutorials(StaticText st) {
        this.stxttutorials = st;
    }

    private PanelLayout loTutorial = new PanelLayout();

    public PanelLayout getLoTutorial() {
        return loTutorial;
    }

    public void setLoTutorial(PanelLayout pl) {
        this.loTutorial = pl;
    }

    private StaticText stxtNew = new StaticText();

    public StaticText getStxtNew() {
        return stxtNew;
    }

    public void setStxtNew(StaticText st) {
        this.stxtNew = st;
    }
    private PanelLayout loFooter = new PanelLayout();

    public PanelLayout getLoFooter() {
        return loFooter;
    }

    public void setLoFooter(PanelLayout pl) {
        this.loFooter = pl;
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
    private PanelLayout loDisclaimer = new PanelLayout();

    public PanelLayout getLoDisclaimer() {
        return loDisclaimer;
    }

    public void setLoDisclaimer(PanelLayout pl) {
        this.loDisclaimer = pl;
    }
    private StaticText stxtDisclaimerLabel = new StaticText();

    public StaticText getStxtDisclaimerLabel() {
        return stxtDisclaimerLabel;
    }

    public void setStxtDisclaimerLabel(StaticText st) {
        this.stxtDisclaimerLabel = st;
    }
    private StaticText stxtDisclaimer = new StaticText();

    public StaticText getStxtDisclaimer() {
        return stxtDisclaimer;
    }

    public void setStxtDisclaimer(StaticText st) {
        this.stxtDisclaimer = st;
    }
    private PanelLayout loUpdate = new PanelLayout();

    public PanelLayout getLoUpdate() {
        return loUpdate;
    }

    public void setLoUpdate(PanelLayout pl) {
        this.loUpdate = pl;
    }
    private StaticText stxtUpdate = new StaticText();

    public StaticText getStxtUpdate() {
        return stxtUpdate;
    }

    public void setStxtUpdate(StaticText st) {
        this.stxtUpdate = st;
    }
    private StaticText stxtUpdateDate = new StaticText();

    public StaticText getStxtUpdateDate() {
        return stxtUpdateDate;
    }

    public void setStxtUpdateDate(StaticText st) {
        this.stxtUpdateDate = st;
    }
    private PanelLayout loTitle = new PanelLayout();

    public PanelLayout getLoTitle() {
        return loTitle;
    }

    public void setLoTitle(PanelLayout pl) {
        this.loTitle = pl;
    }
    private PanelGroup gpTtitle = new PanelGroup();

    public PanelGroup getGpTtitle() {
        return gpTtitle;
    }

    public void setGpTtitle(PanelGroup pg) {
        this.gpTtitle = pg;
    }
    private ImageComponent imgTitle = new ImageComponent();

    public ImageComponent getImgTitle() {
        return imgTitle;
    }

    public void setImgTitle(ImageComponent ic) {
        this.imgTitle = ic;
    }
    private Button btnAbout = new Button();

    public Button getBtnAbout() {
        return btnAbout;
    }

    public void setBtnAbout(Button b) {
        this.btnAbout = b;
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
    
    // </editor-fold>
    
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public RahnumaLogin() {
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
            log("RahnumaLogin Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
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
        stxtInvalidLogin.setVisible( !validLogin );
    }
    
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
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1)getBean("ApplicationBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1)getBean("SessionBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1)getBean("RequestBean1");
    }

    public String btnLogin_action() {
        String userId = (String)txtUserId.getText();
        String password = (String)txtPassword.getText();
        
        validLogin = new WebController().validateUser(userId, password);
        getSessionBean1().setValidLogin(validLogin);
        
        if ( validLogin )
            return "ValidLogin";
        else
            return null;
    }
    
    private boolean validLogin = true;

    public String btnAbout_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String hlTutorials_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }
}

