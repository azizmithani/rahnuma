/*
 * RahnumaParameters.java
 *
 * Created on 29-Jan-2008, 21:20:35
 */
package rahnumaweb;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.AddRemove;
import com.sun.webui.jsf.component.Body;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.Checkbox;
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
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.component.Upload;
import java.io.IOException;
import java.util.Iterator;
import javax.faces.FacesException;
import javax.faces.component.UIComponent;
import javax.faces.context.ExternalContext;
import javax.faces.event.ValueChangeEvent;
import rahnumautilities.Parameter;
import rahnumautilities.Utilities;
import systemobject.PhyloTree;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @author mithani
 */
public class RahnumaParameters extends AbstractPageBean {
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
    private Hyperlink hlOrganism1 = new Hyperlink();

    public Hyperlink getHlOrganism1() {
        return hlOrganism1;
    }

    public void setHlOrganism1(Hyperlink h) {
        this.hlOrganism1 = h;
    }
    private Label lblOrganism1 = new Label();

    public Label getLblOrganism1() {
        return lblOrganism1;
    }

    public void setLblOrganism1(Label l) {
        this.lblOrganism1 = l;
    }
    private PanelLayout loOrganism1Options = new PanelLayout();

    public PanelLayout getLoOrganism1Options() {
        return loOrganism1Options;
    }

    public void setLoOrganism1Options(PanelLayout pl) {
        this.loOrganism1Options = pl;
    }
    private RadioButtonGroup rbgOrganism1 = new RadioButtonGroup();

    public RadioButtonGroup getRbgOrganism1() {
        return rbgOrganism1;
    }

    public void setRbgOrganism1(RadioButtonGroup rbg) {
        this.rbgOrganism1 = rbg;
    }
    private PanelLayout loPathwayPredictionMode = new PanelLayout();

    public PanelLayout getLoPathwayPredictionMode() {
        return loPathwayPredictionMode;
    }

    public void setLoPathwayPredictionMode(PanelLayout pl) {
        this.loPathwayPredictionMode = pl;
    }
    private Label lblPathwayPredictionMode = new Label();

    public Label getLblPathwayPredictionMode() {
        return lblPathwayPredictionMode;
    }

    public void setLblPathwayPredictionMode(Label l) {
        this.lblPathwayPredictionMode = l;
    }
    private Hyperlink hlPathwayPredictionMode = new Hyperlink();

    public Hyperlink getHlPathwayPredictionMode() {
        return hlPathwayPredictionMode;
    }

    public void setHlPathwayPredictionMode(Hyperlink h) {
        this.hlPathwayPredictionMode = h;
    }
    private RadioButtonGroup rbgPathwayPredictionMode = new RadioButtonGroup();

    public RadioButtonGroup getRbgPathwayPredictionMode() {
        return rbgPathwayPredictionMode;
    }

    public void setRbgPathwayPredictionMode(RadioButtonGroup rbg) {
        this.rbgPathwayPredictionMode = rbg;
    }
    private PanelLayout loParameters = new PanelLayout();

    public PanelLayout getLoParameters() {
        return loParameters;
    }

    public void setLoParameters(PanelLayout pl) {
        this.loParameters = pl;
    }
    private PanelLayout loSelectOrganism1 = new PanelLayout();

    public PanelLayout getLoSelectOrganism1() {
        return loSelectOrganism1;
    }

    public void setLoSelectOrganism1(PanelLayout pl) {
        this.loSelectOrganism1 = pl;
    }
    private Label lblOrganism1Set = new Label();

    public Label getLblOrganism1Set() {
        return lblOrganism1Set;
    }

    public void setLblOrganism1Set(Label l) {
        this.lblOrganism1Set = l;
    }
    private RadioButtonGroup rbgOrganism1Mode = new RadioButtonGroup();

    public RadioButtonGroup getRbgOrganism1Mode() {
        return rbgOrganism1Mode;
    }

    public void setRbgOrganism1Mode(RadioButtonGroup rbg) {
        this.rbgOrganism1Mode = rbg;
    }
    private PanelLayout loConnectionOption = new PanelLayout();

    public PanelLayout getLoConnectionOption() {
        return loConnectionOption;
    }

    public void setLoConnectionOption(PanelLayout pl) {
        this.loConnectionOption = pl;
    }
    private Label lblConnectionOption = new Label();

    public Label getLblConnectionOption() {
        return lblConnectionOption;
    }

    public void setLblConnectionOption(Label l) {
        this.lblConnectionOption = l;
    }
    private Hyperlink hlConnectionOption = new Hyperlink();

    public Hyperlink getHlConnectionOption() {
        return hlConnectionOption;
    }

    public void setHlConnectionOption(Hyperlink h) {
        this.hlConnectionOption = h;
    }
    private RadioButtonGroup rbgConnectionOption = new RadioButtonGroup();

    public RadioButtonGroup getRbgConnectionOption() {
        return rbgConnectionOption;
    }

    public void setRbgConnectionOption(RadioButtonGroup rbg) {
        this.rbgConnectionOption = rbg;
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
    private PanelLayout loPathwayParameters = new PanelLayout();

    public PanelLayout getLoPathwayParameters() {
        return loPathwayParameters;
    }

    public void setLoPathwayParameters(PanelLayout pl) {
        this.loPathwayParameters = pl;
    }
    private PanelLayout loPathwayParametersHeading = new PanelLayout();

    public PanelLayout getLoPathwayParametersHeading() {
        return loPathwayParametersHeading;
    }

    public void setLoPathwayParametersHeading(PanelLayout pl) {
        this.loPathwayParametersHeading = pl;
    }
    private StaticText stxtPathwayParameters = new StaticText();

    public StaticText getStxtPathwayParameters() {
        return stxtPathwayParameters;
    }

    public void setStxtPathwayParameters(StaticText st) {
        this.stxtPathwayParameters = st;
    }
    private PanelLayout loCutoffLength = new PanelLayout();

    public PanelLayout getLoCutoffLength() {
        return loCutoffLength;
    }

    public void setLoCutoffLength(PanelLayout pl) {
        this.loCutoffLength = pl;
    }
    private PanelGroup gpCutoffLength = new PanelGroup();

    public PanelGroup getGpCutoffLength() {
        return gpCutoffLength;
    }

    public void setGpCutoffLength(PanelGroup pg) {
        this.gpCutoffLength = pg;
    }
    private Label lblCutoffLength = new Label();

    public Label getLblCutoffLength() {
        return lblCutoffLength;
    }

    public void setLblCutoffLength(Label l) {
        this.lblCutoffLength = l;
    }
    private Hyperlink hlCutoffLength = new Hyperlink();

    public Hyperlink getHlCutoffLength() {
        return hlCutoffLength;
    }

    public void setHlCutoffLength(Hyperlink h) {
        this.hlCutoffLength = h;
    }
    private TextField txtCutoffLength = new TextField();

    public TextField getTxtCutoffLength() {
        return txtCutoffLength;
    }

    public void setTxtCutoffLength(TextField tf) {
        this.txtCutoffLength = tf;
    }
    private StaticText stxtCutoffLength = new StaticText();

    public StaticText getStxtCutoffLength() {
        return stxtCutoffLength;
    }

    public void setStxtCutoffLength(StaticText st) {
        this.stxtCutoffLength = st;
    }
    private PanelLayout loReturnValue = new PanelLayout();

    public PanelLayout getLoReturnValue() {
        return loReturnValue;
    }

    public void setLoReturnValue(PanelLayout pl) {
        this.loReturnValue = pl;
    }
    private Label lblReturnValue = new Label();

    public Label getLblReturnValue() {
        return lblReturnValue;
    }

    public void setLblReturnValue(Label l) {
        this.lblReturnValue = l;
    }
    private Hyperlink hlReturnValue = new Hyperlink();

    public Hyperlink getHlReturnValue() {
        return hlReturnValue;
    }

    public void setHlReturnValue(Hyperlink h) {
        this.hlReturnValue = h;
    }
    private PanelLayout loParametersHeading = new PanelLayout();

    public PanelLayout getLoParametersHeading() {
        return loParametersHeading;
    }

    public void setLoParametersHeading(PanelLayout pl) {
        this.loParametersHeading = pl;
    }
    private StaticText stxtParameters = new StaticText();

    public StaticText getStxtParameters() {
        return stxtParameters;
    }

    public void setStxtParameters(StaticText st) {
        this.stxtParameters = st;
    }
    private PanelLayout loButtons = new PanelLayout();

    public PanelLayout getLoButtons() {
        return loButtons;
    }

    public void setLoButtons(PanelLayout pl) {
        this.loButtons = pl;
    }
    private Button btnSubmit = new Button();

    public Button getBtnSubmit() {
        return btnSubmit;
    }

    public void setBtnSubmit(Button b) {
        this.btnSubmit = b;
    }
    private DropDown drpOrganism1Set = new DropDown();

    public DropDown getDrpOrganism1Set() {
        return drpOrganism1Set;
    }

    public void setDrpOrganism1Set(DropDown dd) {
        this.drpOrganism1Set = dd;
    }
    private PanelLayout loOrganism1 = new PanelLayout();

    public PanelLayout getLoOrganism1() {
        return loOrganism1;
    }

    public void setLoOrganism1(PanelLayout pl) {
        this.loOrganism1 = pl;
    }
    private PanelGroup gpOrganism1Mode = new PanelGroup();

    public PanelGroup getGpOrganism1Mode() {
        return gpOrganism1Mode;
    }

    public void setGpOrganism1Mode(PanelGroup pg) {
        this.gpOrganism1Mode = pg;
    }
    private Label lblOrganism1Mode = new Label();

    public Label getLblOrganism1Mode() {
        return lblOrganism1Mode;
    }

    public void setLblOrganism1Mode(Label l) {
        this.lblOrganism1Mode = l;
    }
    private Hyperlink hlOrganism1Mode = new Hyperlink();

    public Hyperlink getHlOrganism1Mode() {
        return hlOrganism1Mode;
    }

    public void setHlOrganism1Mode(Hyperlink h) {
        this.hlOrganism1Mode = h;
    }
    private StaticText stxtOrganism1 = new StaticText();

    public StaticText getStxtOrganism1() {
        return stxtOrganism1;
    }

    public void setStxtOrganism1(StaticText st) {
        this.stxtOrganism1 = st;
    }
    private PanelLayout loOrganism2 = new PanelLayout();

    public PanelLayout getLoOrganism2() {
        return loOrganism2;
    }

    public void setLoOrganism2(PanelLayout pl) {
        this.loOrganism2 = pl;
    }
    private PanelLayout loOrganism2Options = new PanelLayout();

    public PanelLayout getLoOrganism2Options() {
        return loOrganism2Options;
    }

    public void setLoOrganism2Options(PanelLayout pl) {
        this.loOrganism2Options = pl;
    }
    private Label lblOrganism2 = new Label();

    public Label getLblOrganism2() {
        return lblOrganism2;
    }

    public void setLblOrganism2(Label l) {
        this.lblOrganism2 = l;
    }
    private Hyperlink hlOrganism2 = new Hyperlink();

    public Hyperlink getHlOrganism2() {
        return hlOrganism2;
    }

    public void setHlOrganism2(Hyperlink h) {
        this.hlOrganism2 = h;
    }
    private RadioButtonGroup rbgOrganism2 = new RadioButtonGroup();

    public RadioButtonGroup getRbgOrganism2() {
        return rbgOrganism2;
    }

    public void setRbgOrganism2(RadioButtonGroup rbg) {
        this.rbgOrganism2 = rbg;
    }
    private PanelLayout loSelectOrganism2 = new PanelLayout();

    public PanelLayout getLoSelectOrganism2() {
        return loSelectOrganism2;
    }

    public void setLoSelectOrganism2(PanelLayout pl) {
        this.loSelectOrganism2 = pl;
    }
    private Label lblOrganism2Set = new Label();

    public Label getLblOrganism2Set() {
        return lblOrganism2Set;
    }

    public void setLblOrganism2Set(Label l) {
        this.lblOrganism2Set = l;
    }
    private DropDown drpOrganism2Set = new DropDown();

    public DropDown getDrpOrganism2Set() {
        return drpOrganism2Set;
    }

    public void setDrpOrganism2Set(DropDown dd) {
        this.drpOrganism2Set = dd;
    }
    private StaticText stxtOrganism2 = new StaticText();

    public StaticText getStxtOrganism2() {
        return stxtOrganism2;
    }

    public void setStxtOrganism2(StaticText st) {
        this.stxtOrganism2 = st;
    }
    private PanelGroup gpOrganism2Mode = new PanelGroup();

    public PanelGroup getGpOrganism2Mode() {
        return gpOrganism2Mode;
    }

    public void setGpOrganism2Mode(PanelGroup pg) {
        this.gpOrganism2Mode = pg;
    }
    private Label lblOrganism2Mode = new Label();

    public Label getLblOrganism2Mode() {
        return lblOrganism2Mode;
    }

    public void setLblOrganism2Mode(Label l) {
        this.lblOrganism2Mode = l;
    }
    private Hyperlink hlOrganism2Mode = new Hyperlink();

    public Hyperlink getHlOrganism2Mode() {
        return hlOrganism2Mode;
    }

    public void setHlOrganism2Mode(Hyperlink h) {
        this.hlOrganism2Mode = h;
    }
    private RadioButtonGroup rbgOrganism2Mode = new RadioButtonGroup();

    public RadioButtonGroup getRbgOrganism2Mode() {
        return rbgOrganism2Mode;
    }

    public void setRbgOrganism2Mode(RadioButtonGroup rbg) {
        this.rbgOrganism2Mode = rbg;
    }
    private PanelLayout loPhylogeny = new PanelLayout();

    public PanelLayout getLoPhylogeny() {
        return loPhylogeny;
    }

    public void setLoPhylogeny(PanelLayout pl) {
        this.loPhylogeny = pl;
    }
    private Label lblPhylogeny = new Label();

    public Label getLblPhylogeny() {
        return lblPhylogeny;
    }

    public void setLblPhylogeny(Label l) {
        this.lblPhylogeny = l;
    }
    private Hyperlink hlPhylogeny = new Hyperlink();

    public Hyperlink getHlPhylogeny() {
        return hlPhylogeny;
    }

    public void setHlPhylogeny(Hyperlink h) {
        this.hlPhylogeny = h;
    }
    private TextArea txtPhylogeny = new TextArea();

    public TextArea getTxtPhylogeny() {
        return txtPhylogeny;
    }

    public void setTxtPhylogeny(TextArea ta) {
        this.txtPhylogeny = ta;
    }
    private StaticText stxtPhylogeny = new StaticText();

    public StaticText getStxtPhylogeny() {
        return stxtPhylogeny;
    }

    public void setStxtPhylogeny(StaticText st) {
        this.stxtPhylogeny = st;
    }
    private PanelGroup gpPhylogeny = new PanelGroup();

    public PanelGroup getGpPhylogeny() {
        return gpPhylogeny;
    }

    public void setGpPhylogeny(PanelGroup pg) {
        this.gpPhylogeny = pg;
    }
    private Button btnBack = new Button();

    public Button getBtnBack() {
        return btnBack;
    }

    public void setBtnBack(Button b) {
        this.btnBack = b;
    }
    private PanelLayout loStartMetabolites = new PanelLayout();

    public PanelLayout getLoStartMetabolites() {
        return loStartMetabolites;
    }

    public void setLoStartMetabolites(PanelLayout pl) {
        this.loStartMetabolites = pl;
    }
    private Label lblStartMetabolites = new Label();

    public Label getLblStartMetabolites() {
        return lblStartMetabolites;
    }

    public void setLblStartMetabolites(Label l) {
        this.lblStartMetabolites = l;
    }
    private Hyperlink hlStartMetabolites = new Hyperlink();

    public Hyperlink getHlStartMetabolites() {
        return hlStartMetabolites;
    }

    public void setHlStartMetabolites(Hyperlink h) {
        this.hlStartMetabolites = h;
    }
    private DropDown drpStartMetaboliteSet = new DropDown();

    public DropDown getDrpStartMetaboliteSet() {
        return drpStartMetaboliteSet;
    }

    public void setDrpStartMetaboliteSet(DropDown dd) {
        this.drpStartMetaboliteSet = dd;
    }
    private StaticText stxtStartMetabolites = new StaticText();

    public StaticText getStxtStartMetabolites() {
        return stxtStartMetabolites;
    }

    public void setStxtStartMetabolites(StaticText st) {
        this.stxtStartMetabolites = st;
    }
    private Label lblStartMetaboliteSet = new Label();

    public Label getLblStartMetaboliteSet() {
        return lblStartMetaboliteSet;
    }

    public void setLblStartMetaboliteSet(Label l) {
        this.lblStartMetaboliteSet = l;
    }
    private PanelLayout loStartMetabolitesHeading = new PanelLayout();

    public PanelLayout getLoStartMetabolitesHeading() {
        return loStartMetabolitesHeading;
    }

    public void setLoStartMetabolitesHeading(PanelLayout pl) {
        this.loStartMetabolitesHeading = pl;
    }
    private PanelLayout loEndMetabolitesHeading = new PanelLayout();

    public PanelLayout getLoEndMetabolitesHeading() {
        return loEndMetabolitesHeading;
    }

    public void setLoEndMetabolitesHeading(PanelLayout pl) {
        this.loEndMetabolitesHeading = pl;
    }
    private Label lblEndMetabolites = new Label();

    public Label getLblEndMetabolites() {
        return lblEndMetabolites;
    }

    public void setLblEndMetabolites(Label l) {
        this.lblEndMetabolites = l;
    }
    private Hyperlink hlEndMetabolites = new Hyperlink();

    public Hyperlink getHlEndMetabolites() {
        return hlEndMetabolites;
    }

    public void setHlEndMetabolites(Hyperlink h) {
        this.hlEndMetabolites = h;
    }
    private PanelLayout loEndMetabolites = new PanelLayout();

    public PanelLayout getLoEndMetabolites() {
        return loEndMetabolites;
    }

    public void setLoEndMetabolites(PanelLayout pl) {
        this.loEndMetabolites = pl;
    }
    private Label lblEndMetaboliteSet = new Label();

    public Label getLblEndMetaboliteSet() {
        return lblEndMetaboliteSet;
    }

    public void setLblEndMetaboliteSet(Label l) {
        this.lblEndMetaboliteSet = l;
    }
    private DropDown drpEndMetaboliteSet = new DropDown();

    public DropDown getDrpEndMetaboliteSet() {
        return drpEndMetaboliteSet;
    }

    public void setDrpEndMetaboliteSet(DropDown dd) {
        this.drpEndMetaboliteSet = dd;
    }
    private StaticText stxtEndMetabolites = new StaticText();

    public StaticText getStxtEndMetabolites() {
        return stxtEndMetabolites;
    }

    public void setStxtEndMetabolites(StaticText st) {
        this.stxtEndMetabolites = st;
    }
    private PanelLayout loConnectionFile = new PanelLayout();

    public PanelLayout getLoConnectionFile() {
        return loConnectionFile;
    }

    public void setLoConnectionFile(PanelLayout pl) {
        this.loConnectionFile = pl;
    }
    private Label lblConnectionFile = new Label();

    public Label getLblConnectionFile() {
        return lblConnectionFile;
    }

    public void setLblConnectionFile(Label l) {
        this.lblConnectionFile = l;
    }
    private Upload fileConnections = new Upload();

    public Upload getFileConnections() {
        return fileConnections;
    }

    public void setFileConnections(Upload u) {
        this.fileConnections = u;
    }
    private StaticText stxtConnectionFile = new StaticText();

    public StaticText getStxtConnectionFile() {
        return stxtConnectionFile;
    }

    public void setStxtConnectionFile(StaticText st) {
        this.stxtConnectionFile = st;
    }
    private PanelGroup gpConnectionFile = new PanelGroup();

    public PanelGroup getGpConnectionFile() {
        return gpConnectionFile;
    }

    public void setGpConnectionFile(PanelGroup pg) {
        this.gpConnectionFile = pg;
    }
    private PanelLayout loOptionalConstraints = new PanelLayout();

    public PanelLayout getLoOptionalConstraints() {
        return loOptionalConstraints;
    }

    public void setLoOptionalConstraints(PanelLayout pl) {
        this.loOptionalConstraints = pl;
    }
    private Label lblOptionalConstraints = new Label();

    public Label getLblOptionalConstraints() {
        return lblOptionalConstraints;
    }

    public void setLblOptionalConstraints(Label l) {
        this.lblOptionalConstraints = l;
    }
    private Hyperlink hlOptionalConstraints = new Hyperlink();

    public Hyperlink getHlOptionalConstraints() {
        return hlOptionalConstraints;
    }

    public void setHlOptionalConstraints(Hyperlink h) {
        this.hlOptionalConstraints = h;
    }
    private PanelGroup gpIgnoreMetabolites = new PanelGroup();

    public PanelGroup getGpIgnoreMetabolites() {
        return gpIgnoreMetabolites;
    }

    public void setGpIgnoreMetabolites(PanelGroup pg) {
        this.gpIgnoreMetabolites = pg;
    }
    private PanelGroup gpRequiredElements = new PanelGroup();

    public PanelGroup getGpRequiredElements() {
        return gpRequiredElements;
    }

    public void setGpRequiredElements(PanelGroup pg) {
        this.gpRequiredElements = pg;
    }
    private Label lblIgnoreMetabolites = new Label();

    public Label getLblIgnoreMetabolites() {
        return lblIgnoreMetabolites;
    }

    public void setLblIgnoreMetabolites(Label l) {
        this.lblIgnoreMetabolites = l;
    }
    private Upload fileIgnoreMetabolites = new Upload();

    public Upload getFileIgnoreMetabolites() {
        return fileIgnoreMetabolites;
    }

    public void setFileIgnoreMetabolites(Upload u) {
        this.fileIgnoreMetabolites = u;
    }
    private Label lblRequiredElements = new Label();

    public Label getLblRequiredElements() {
        return lblRequiredElements;
    }

    public void setLblRequiredElements(Label l) {
        this.lblRequiredElements = l;
    }
    private Upload fileRequiredElements = new Upload();

    public Upload getFileRequiredElements() {
        return fileRequiredElements;
    }

    public void setFileRequiredElements(Upload u) {
        this.fileRequiredElements = u;
    }
    private RadioButtonGroup rbgReturnValue = new RadioButtonGroup();

    public RadioButtonGroup getRbgReturnValue() {
        return rbgReturnValue;
    }

    public void setRbgReturnValue(RadioButtonGroup rbg) {
        this.rbgReturnValue = rbg;
    }
    private PanelLayout loJobSubmissionError = new PanelLayout();

    public PanelLayout getLoJobSubmissionError() {
        return loJobSubmissionError;
    }

    public void setLoJobSubmissionError(PanelLayout pl) {
        this.loJobSubmissionError = pl;
    }
    private StaticText stxtJobSubmissionError = new StaticText();

    public StaticText getStxtJobSubmissionError() {
        return stxtJobSubmissionError;
    }

    public void setStxtJobSubmissionError(StaticText st) {
        this.stxtJobSubmissionError = st;
    }
    private AddRemove arOrganism1 = new AddRemove();

    public AddRemove getArOrganism1() {
        return arOrganism1;
    }

    public void setArOrganism1(AddRemove ar) {
        this.arOrganism1 = ar;
    }
    private AddRemove arOrganism2 = new AddRemove();

    public AddRemove getArOrganism2() {
        return arOrganism2;
    }

    public void setArOrganism2(AddRemove ar) {
        this.arOrganism2 = ar;
    }
    private AddRemove arStartMetabolites = new AddRemove();

    public AddRemove getArStartMetabolites() {
        return arStartMetabolites;
    }

    public void setArStartMetabolites(AddRemove ar) {
        this.arStartMetabolites = ar;
    }
    private AddRemove arEndMetabolites = new AddRemove();

    public AddRemove getArEndMetabolites() {
        return arEndMetabolites;
    }

    public void setArEndMetabolites(AddRemove ar) {
        this.arEndMetabolites = ar;
    }
    private Form frmHeader = new Form();

    public Form getFrmHeader() {
        return frmHeader;
    }

    public void setFrmHeader(Form f) {
        this.frmHeader = f;
    }
    private PanelGroup gpIgnoreMetabolitesNetworkBuilding1 = new PanelGroup();

    public PanelGroup getGpIgnoreMetabolitesNetworkBuilding1() {
        return gpIgnoreMetabolitesNetworkBuilding1;
    }

    public void setGpIgnoreMetabolitesNetworkBuilding1(PanelGroup pg) {
        this.gpIgnoreMetabolitesNetworkBuilding1 = pg;
    }
    private Label lblIgnoreMetabolitesNetworkBuilding1 = new Label();

    public Label getLblIgnoreMetabolitesNetworkBuilding1() {
        return lblIgnoreMetabolitesNetworkBuilding1;
    }

    public void setLblIgnoreMetabolitesNetworkBuilding1(Label l) {
        this.lblIgnoreMetabolitesNetworkBuilding1 = l;
    }
    private Upload fileIgnoreMetabolitesNetworkBuilding1 = new Upload();

    public Upload getFileIgnoreMetabolitesNetworkBuilding1() {
        return fileIgnoreMetabolitesNetworkBuilding1;
    }

    public void setFileIgnoreMetabolitesNetworkBuilding1(Upload u) {
        this.fileIgnoreMetabolitesNetworkBuilding1 = u;
    }
    private PanelLayout loNetworkParametersHeading = new PanelLayout();

    public PanelLayout getLoNetworkParametersHeading() {
        return loNetworkParametersHeading;
    }

    public void setLoNetworkParametersHeading(PanelLayout pl) {
        this.loNetworkParametersHeading = pl;
    }
    private StaticText stxtNetworkParameters = new StaticText();

    public StaticText getStxtNetworkParameters() {
        return stxtNetworkParameters;
    }

    public void setStxtNetworkParameters(StaticText st) {
        this.stxtNetworkParameters = st;
    }
    private PanelLayout loOptionalParameters1 = new PanelLayout();

    public PanelLayout getLoOptionalParameters1() {
        return loOptionalParameters1;
    }

    public void setLoOptionalParameters1(PanelLayout pl) {
        this.loOptionalParameters1 = pl;
    }
    private Label lblOptionalParametersNetworkBuilding1 = new Label();

    public Label getLblOptionalParametersNetworkBuilding1() {
        return lblOptionalParametersNetworkBuilding1;
    }

    public void setLblOptionalParametersNetworkBuilding1(Label l) {
        this.lblOptionalParametersNetworkBuilding1 = l;
    }
    private Hyperlink hlOptionalParametersNetworkBuilding1 = new Hyperlink();

    public Hyperlink getHlOptionalParametersNetworkBuilding1() {
        return hlOptionalParametersNetworkBuilding1;
    }

    public void setHlOptionalParametersNetworkBuilding1(Hyperlink h) {
        this.hlOptionalParametersNetworkBuilding1 = h;
    }
    private PanelLayout loNetworkCutoff1 = new PanelLayout();

    public PanelLayout getLoNetworkCutoff1() {
        return loNetworkCutoff1;
    }

    public void setLoNetworkCutoff1(PanelLayout pl) {
        this.loNetworkCutoff1 = pl;
    }
    private PanelGroup gpNetworkCutoff1 = new PanelGroup();

    public PanelGroup getGpNetworkCutoff1() {
        return gpNetworkCutoff1;
    }

    public void setGpNetworkCutoff1(PanelGroup pg) {
        this.gpNetworkCutoff1 = pg;
    }
    private Label lblNetworkCutoff1 = new Label();

    public Label getLblNetworkCutoff1() {
        return lblNetworkCutoff1;
    }

    public void setLblNetworkCutoff1(Label l) {
        this.lblNetworkCutoff1 = l;
    }
    private Hyperlink hlNetworkCutoff1 = new Hyperlink();

    public Hyperlink getHlNetworkCutoff1() {
        return hlNetworkCutoff1;
    }

    public void setHlNetworkCutoff1(Hyperlink h) {
        this.hlNetworkCutoff1 = h;
    }
    private TextField txtNetworkCutoff1 = new TextField();

    public TextField getTxtNetworkCutoff1() {
        return txtNetworkCutoff1;
    }

    public void setTxtNetworkCutoff1(TextField tf) {
        this.txtNetworkCutoff1 = tf;
    }
    private StaticText stxtNetworkCutoff1 = new StaticText();

    public StaticText getStxtNetworkCutoff1() {
        return stxtNetworkCutoff1;
    }

    public void setStxtNetworkCutoff1(StaticText st) {
        this.stxtNetworkCutoff1 = st;
    }
    private PanelLayout loNPOrganism1 = new PanelLayout();

    public PanelLayout getLoNPOrganism1() {
        return loNPOrganism1;
    }

    public void setLoNPOrganism1(PanelLayout pl) {
        this.loNPOrganism1 = pl;
    }
    private PanelLayout loNPOrganism2 = new PanelLayout();

    public PanelLayout getLoNPOrganism2() {
        return loNPOrganism2;
    }

    public void setLoNPOrganism2(PanelLayout pl) {
        this.loNPOrganism2 = pl;
    }
    private PanelLayout loNetworkCutoff2 = new PanelLayout();

    public PanelLayout getLoNetworkCutoff2() {
        return loNetworkCutoff2;
    }

    public void setLoNetworkCutoff2(PanelLayout pl) {
        this.loNetworkCutoff2 = pl;
    }
    private PanelGroup gpNetworkCutoff2 = new PanelGroup();

    public PanelGroup getGpNetworkCutoff2() {
        return gpNetworkCutoff2;
    }

    public void setGpNetworkCutoff2(PanelGroup pg) {
        this.gpNetworkCutoff2 = pg;
    }
    private Label lblNetworkCutoff2 = new Label();

    public Label getLblNetworkCutoff2() {
        return lblNetworkCutoff2;
    }

    public void setLblNetworkCutoff2(Label l) {
        this.lblNetworkCutoff2 = l;
    }
    private Hyperlink hlNetworkCutoff2 = new Hyperlink();

    public Hyperlink getHlNetworkCutoff2() {
        return hlNetworkCutoff2;
    }

    public void setHlNetworkCutoff2(Hyperlink h) {
        this.hlNetworkCutoff2 = h;
    }
    private TextField txtNetworkCutoff2 = new TextField();

    public TextField getTxtNetworkCutoff2() {
        return txtNetworkCutoff2;
    }

    public void setTxtNetworkCutoff2(TextField tf) {
        this.txtNetworkCutoff2 = tf;
    }
    private StaticText stxtNetworkCutoff2 = new StaticText();

    public StaticText getStxtNetworkCutoff2() {
        return stxtNetworkCutoff2;
    }

    public void setStxtNetworkCutoff2(StaticText st) {
        this.stxtNetworkCutoff2 = st;
    }
    private PanelLayout loOptionalParameters2 = new PanelLayout();

    public PanelLayout getLoOptionalParameters2() {
        return loOptionalParameters2;
    }

    public void setLoOptionalParameters2(PanelLayout pl) {
        this.loOptionalParameters2 = pl;
    }
    private Label lblOptionalParametersNetworkBuilding2 = new Label();

    public Label getLblOptionalParametersNetworkBuilding2() {
        return lblOptionalParametersNetworkBuilding2;
    }

    public void setLblOptionalParametersNetworkBuilding2(Label l) {
        this.lblOptionalParametersNetworkBuilding2 = l;
    }
    private Hyperlink hlOptionalParametersNetworkBuilding2 = new Hyperlink();

    public Hyperlink getHlOptionalParametersNetworkBuilding2() {
        return hlOptionalParametersNetworkBuilding2;
    }

    public void setHlOptionalParametersNetworkBuilding2(Hyperlink h) {
        this.hlOptionalParametersNetworkBuilding2 = h;
    }
    private PanelGroup gpIgnoreMetabolitesNetworkBuilding2 = new PanelGroup();

    public PanelGroup getGpIgnoreMetabolitesNetworkBuilding2() {
        return gpIgnoreMetabolitesNetworkBuilding2;
    }

    public void setGpIgnoreMetabolitesNetworkBuilding2(PanelGroup pg) {
        this.gpIgnoreMetabolitesNetworkBuilding2 = pg;
    }
    private Label lblIgnoreMetabolitesNetworkBuilding2 = new Label();

    public Label getLblIgnoreMetabolitesNetworkBuilding2() {
        return lblIgnoreMetabolitesNetworkBuilding2;
    }

    public void setLblIgnoreMetabolitesNetworkBuilding2(Label l) {
        this.lblIgnoreMetabolitesNetworkBuilding2 = l;
    }
    private Upload fileIgnoreMetabolitesNetworkBuilding2 = new Upload();

    public Upload getFileIgnoreMetabolitesNetworkBuilding2() {
        return fileIgnoreMetabolitesNetworkBuilding2;
    }

    public void setFileIgnoreMetabolitesNetworkBuilding2(Upload u) {
        this.fileIgnoreMetabolitesNetworkBuilding2 = u;
    }
    private Hyperlink hlIgnoreMetabolitesNetworkBuilding2 = new Hyperlink();

    public Hyperlink getHlIgnoreMetabolitesNetworkBuilding2() {
        return hlIgnoreMetabolitesNetworkBuilding2;
    }

    public void setHlIgnoreMetabolitesNetworkBuilding2(Hyperlink h) {
        this.hlIgnoreMetabolitesNetworkBuilding2 = h;
    }
    private Hyperlink hlIgnoreMetabolitesNetworkBuilding1 = new Hyperlink();

    public Hyperlink getHlIgnoreMetabolitesNetworkBuilding1() {
        return hlIgnoreMetabolitesNetworkBuilding1;
    }

    public void setHlIgnoreMetabolitesNetworkBuilding1(Hyperlink h) {
        this.hlIgnoreMetabolitesNetworkBuilding1 = h;
    }
    private Hyperlink hlIgnoreMetabolites = new Hyperlink();

    public Hyperlink getHlIgnoreMetabolites() {
        return hlIgnoreMetabolites;
    }

    public void setHlIgnoreMetabolites(Hyperlink h) {
        this.hlIgnoreMetabolites = h;
    }
    private StaticText stxtIgnoreMetabolitesNetworkBuilding1 = new StaticText();

    public StaticText getStxtIgnoreMetabolitesNetworkBuilding1() {
        return stxtIgnoreMetabolitesNetworkBuilding1;
    }

    public void setStxtIgnoreMetabolitesNetworkBuilding1(StaticText st) {
        this.stxtIgnoreMetabolitesNetworkBuilding1 = st;
    }
    private Button btnIgnoreMetabolitesNetworkBuilding1 = new Button();

    public Button getBtnIgnoreMetabolitesNetworkBuilding1() {
        return btnIgnoreMetabolitesNetworkBuilding1;
    }

    public void setBtnIgnoreMetabolitesNetworkBuilding1(Button b) {
        this.btnIgnoreMetabolitesNetworkBuilding1 = b;
    }
    private StaticText stxtIgnoreMetabolitesNetworkBuilding2 = new StaticText();

    public StaticText getStxtIgnoreMetabolitesNetworkBuilding2() {
        return stxtIgnoreMetabolitesNetworkBuilding2;
    }

    public void setStxtIgnoreMetabolitesNetworkBuilding2(StaticText st) {
        this.stxtIgnoreMetabolitesNetworkBuilding2 = st;
    }
    private Button btnIgnoreMetabolitesNetworkBuilding2 = new Button();

    public Button getBtnIgnoreMetabolitesNetworkBuilding2() {
        return btnIgnoreMetabolitesNetworkBuilding2;
    }

    public void setBtnIgnoreMetabolitesNetworkBuilding2(Button b) {
        this.btnIgnoreMetabolitesNetworkBuilding2 = b;
    }
    private StaticText stxtConnectionFileStatus = new StaticText();

    public StaticText getStxtConnectionFileStatus() {
        return stxtConnectionFileStatus;
    }

    public void setStxtConnectionFileStatus(StaticText st) {
        this.stxtConnectionFileStatus = st;
    }
    private Button btnConnectionFile = new Button();

    public Button getBtnConnectionFile() {
        return btnConnectionFile;
    }

    public void setBtnConnectionFile(Button b) {
        this.btnConnectionFile = b;
    }
    private StaticText stxtIgnoreMetabolitesFile = new StaticText();

    public StaticText getStxtIgnoreMetabolitesFile() {
        return stxtIgnoreMetabolitesFile;
    }

    public void setStxtIgnoreMetabolitesFile(StaticText st) {
        this.stxtIgnoreMetabolitesFile = st;
    }
    private Button btnIgnoreMetabolitesFile = new Button();

    public Button getBtnIgnoreMetabolitesFile() {
        return btnIgnoreMetabolitesFile;
    }

    public void setBtnIgnoreMetabolitesFile(Button b) {
        this.btnIgnoreMetabolitesFile = b;
    }
    private StaticText stxtRequiredElementsFile = new StaticText();

    public StaticText getStxtRequiredElementsFile() {
        return stxtRequiredElementsFile;
    }

    public void setStxtRequiredElementsFile(StaticText st) {
        this.stxtRequiredElementsFile = st;
    }
    private Button btnRequiredElementsFile = new Button();

    public Button getBtnRequiredElementsFile() {
        return btnRequiredElementsFile;
    }

    public void setBtnRequiredElementsFile(Button b) {
        this.btnRequiredElementsFile = b;
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
    private Hyperlink hlStatistics1 = new Hyperlink();

    public Hyperlink getHlStatistics1() {
        return hlStatistics1;
    }

    public void setHlStatistics1(Hyperlink h) {
        this.hlStatistics1 = h;
    }
    private StaticText stxtFooter2 = new StaticText();

    public StaticText getStxtFooter2() {
        return stxtFooter2;
    }

    public void setStxtFooter2(StaticText st) {
        this.stxtFooter2 = st;
    }
    private Hyperlink hlPlantsSciences1 = new Hyperlink();

    public Hyperlink getHlPlantsSciences1() {
        return hlPlantsSciences1;
    }

    public void setHlPlantsSciences1(Hyperlink h) {
        this.hlPlantsSciences1 = h;
    }
    private StaticText stxtFooter3 = new StaticText();

    public StaticText getStxtFooter3() {
        return stxtFooter3;
    }

    public void setStxtFooter3(StaticText st) {
        this.stxtFooter3 = st;
    }
    private Hyperlink hlOxford1 = new Hyperlink();

    public Hyperlink getHlOxford1() {
        return hlOxford1;
    }

    public void setHlOxford1(Hyperlink h) {
        this.hlOxford1 = h;
    }
    private PanelLayout loDisclaimer = new PanelLayout();

    public PanelLayout getLoDisclaimer() {
        return loDisclaimer;
    }

    public void setLoDisclaimer(PanelLayout pl) {
        this.loDisclaimer = pl;
    }
    private StaticText stxtDisclaimerLabel1 = new StaticText();

    public StaticText getStxtDisclaimerLabel1() {
        return stxtDisclaimerLabel1;
    }

    public void setStxtDisclaimerLabel1(StaticText st) {
        this.stxtDisclaimerLabel1 = st;
    }
    private StaticText stxtDisclaimer1 = new StaticText();

    public StaticText getStxtDisclaimer1() {
        return stxtDisclaimer1;
    }

    public void setStxtDisclaimer1(StaticText st) {
        this.stxtDisclaimer1 = st;
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
    private StaticText stxtStartMetabolitesNote = new StaticText();

    public StaticText getStxtStartMetabolitesNote() {
        return stxtStartMetabolitesNote;
    }

    public void setStxtStartMetabolitesNote(StaticText st) {
        this.stxtStartMetabolitesNote = st;
    }
    private PanelGroup gpStartMetabolitesNote = new PanelGroup();

    public PanelGroup getGpStartMetabolitesNote() {
        return gpStartMetabolitesNote;
    }

    public void setGpStartMetabolitesNote(PanelGroup pg) {
        this.gpStartMetabolitesNote = pg;
    }
    private PanelGroup gpEndMetabolitesNote = new PanelGroup();

    public PanelGroup getGpEndMetabolitesNote() {
        return gpEndMetabolitesNote;
    }

    public void setGpEndMetabolitesNote(PanelGroup pg) {
        this.gpEndMetabolitesNote = pg;
    }
    private StaticText stxtEndMetabolitesNote = new StaticText();

    public StaticText getStxtEndMetabolitesNote() {
        return stxtEndMetabolitesNote;
    }

    public void setStxtEndMetabolitesNote(StaticText st) {
        this.stxtEndMetabolitesNote = st;
    }
    private Checkbox chkUseDefaultIgnoreMetabolites = new Checkbox();

    public Checkbox getChkUseDefaultIgnoreMetabolites() {
        return chkUseDefaultIgnoreMetabolites;
    }

    public void setChkUseDefaultIgnoreMetabolites(Checkbox c) {
        this.chkUseDefaultIgnoreMetabolites = c;
    }

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public RahnumaParameters() {
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
            log("RahnumaParameters Initialization Failure", e);
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
        // set comparative analysis related components' visibility & label
        boolean comparativeAnalysis = sb.getSelectedAnalysis().equals(Parameter.OPTION_ANALYSIS_COMPARATIVE);
        boolean phyloAnalysis = (sb.getSelectedAnalysis().equals(Parameter.OPTION_ANALYSIS_NETWORK) && sb.getSelectedAnalysisType().equals(Parameter.OPTION_ANALYSIS_TYPE_ANCESTRAL)) || sb.getSelectedAnalysisMode().equals(Parameter.OPTION_ANALYSIS_MODE_PHYLOGENY);
        boolean allButOneComparison = sb.getSelectedAnalysis().equals(Parameter.OPTION_ANALYSIS_COMPARATIVE) && sb.getSelectedAnalysisType().equals(Parameter.OPTION_ANALYSIS_TYPE_ALL_BUT_ONE);

        loPhylogeny.setVisible(phyloAnalysis);
        loOrganism1.setVisible(!phyloAnalysis);
        // organism 2 is only to be displayed if its comparative analysis on organsims but not of type: all but one
        loOrganism2.setVisible(comparativeAnalysis && !phyloAnalysis && !allButOneComparison);

        // set the label for org 1 and organism 1 option parameter value
        if (comparativeAnalysis) {
            if (allButOneComparison) {
                sb.setLabelOrganism1("Organisms *");
                sb.setSelectedOptionOrganism1(Parameter.OPTION_ORGANISM_OPTION_SELECT);
            } else {
                sb.setLabelOrganism1("Organism(s) 1 *");
            }
        } else {
            sb.setLabelOrganism1("Organism(s) *");
        }


        // show select 1 organism panel only if required
        boolean showSelectOrganism1Panel = getSessionBean1().getSelectedOptionOrganism1().equals(Parameter.OPTION_ORGANISM_OPTION_SELECT);
        getLblOrganism1Set().setVisible(showSelectOrganism1Panel);
        getDrpOrganism1Set().setVisible(showSelectOrganism1Panel);
        getArOrganism1().setVisible(showSelectOrganism1Panel);
        getStxtOrganism1().setVisible(showSelectOrganism1Panel);
        getLblOrganism1Mode().setVisible(showSelectOrganism1Panel);
        getHlOrganism1Mode().setVisible(showSelectOrganism1Panel);
        getRbgOrganism1Mode().setVisible(showSelectOrganism1Panel);

        // show select 2 organism panel only if required
        boolean showSelectOrganism2Panel = getSessionBean1().getSelectedOptionOrganism2().equals(Parameter.OPTION_ORGANISM_OPTION_SELECT);
        getLblOrganism2Set().setVisible(showSelectOrganism2Panel);
        getDrpOrganism2Set().setVisible(showSelectOrganism2Panel);
        getArOrganism2().setVisible(showSelectOrganism2Panel);
        getStxtOrganism2().setVisible(showSelectOrganism2Panel);
        getLblOrganism2Mode().setVisible(showSelectOrganism2Panel);
        getHlOrganism2Mode().setVisible(showSelectOrganism2Panel);
        getRbgOrganism2Mode().setVisible(showSelectOrganism2Panel);

        // don't show organism 1 option for all but comparison (reference org is not allowed here!)
        getLoOrganism1Options().setVisible(!allButOneComparison);

        // don't show organism mode for all but comparison or individual organism
        boolean modeRequired = sb.getSelectedPhylogeneticMode() != null && sb.getSelectedPhylogeneticMode().equals(Parameter.OPTION_ANALYSIS_MODE_COLLECTIVE) ||
                sb.getSelectedAnalysis().equals(Parameter.OPTION_ANALYSIS_COMPARATIVE);
        getGpOrganism1Mode().setVisible(!allButOneComparison && modeRequired);
        getGpOrganism2Mode().setVisible(modeRequired);

        // Set network building parameters visibility
        boolean neighbourhoodBuilding1 = phyloAnalysis && (sb.getSelectedAnalysisMode().equals(Parameter.OPTION_NETWORK_BUILDING_NEIGHBOURHOOD) || sb.getSelectedPhylogeneticMode().equals(Parameter.OPTION_NETWORK_BUILDING_NEIGHBOURHOOD));
        getLoNetworkParametersHeading().setVisible(neighbourhoodBuilding1);
        // organism 1
        neighbourhoodBuilding1 = neighbourhoodBuilding1 || (sb.getSelectedOrganism1Mode() != null && sb.getSelectedOrganism1Mode().equals(Parameter.OPTION_NETWORK_BUILDING_NEIGHBOURHOOD) || sb.getSelectedPhylogeneticMode().equals(Parameter.OPTION_NETWORK_BUILDING_NEIGHBOURHOOD));
        getLblNetworkCutoff1().setVisible(neighbourhoodBuilding1);
        getHlNetworkCutoff1().setVisible(neighbourhoodBuilding1);
        getTxtNetworkCutoff1().setVisible(neighbourhoodBuilding1);
        getStxtNetworkCutoff1().setVisible(neighbourhoodBuilding1);
        getLblOptionalParametersNetworkBuilding1().setVisible(neighbourhoodBuilding1);
        getHlOptionalParametersNetworkBuilding1().setVisible(neighbourhoodBuilding1);
        getLblIgnoreMetabolitesNetworkBuilding1().setVisible(neighbourhoodBuilding1);
        getFileIgnoreMetabolitesNetworkBuilding1().setVisible(neighbourhoodBuilding1);
        getHlIgnoreMetabolitesNetworkBuilding1().setVisible(neighbourhoodBuilding1);
        getStxtIgnoreMetabolitesNetworkBuilding1().setVisible(neighbourhoodBuilding1 && sb.getIgnoreMetabolitesNetworkBuilding1File() != null);
        getBtnIgnoreMetabolitesNetworkBuilding1().setVisible(neighbourhoodBuilding1 && sb.getIgnoreMetabolitesNetworkBuilding1File() != null);
        // organism 2
        boolean neighbourhoodBuilding2 = sb.getSelectedOrganism2Mode() != null && sb.getSelectedOrganism2Mode().equals(Parameter.OPTION_NETWORK_BUILDING_NEIGHBOURHOOD) || sb.getSelectedPhylogeneticMode().equals(Parameter.OPTION_NETWORK_BUILDING_NEIGHBOURHOOD);
        getLblNetworkCutoff2().setVisible(neighbourhoodBuilding2);
        getHlNetworkCutoff2().setVisible(neighbourhoodBuilding2);
        getTxtNetworkCutoff2().setVisible(neighbourhoodBuilding2);
        getStxtNetworkCutoff2().setVisible(neighbourhoodBuilding2);
        getLblOptionalParametersNetworkBuilding2().setVisible(neighbourhoodBuilding2);
        getHlOptionalParametersNetworkBuilding2().setVisible(neighbourhoodBuilding2);
        getLblIgnoreMetabolitesNetworkBuilding2().setVisible(neighbourhoodBuilding2);
        getFileIgnoreMetabolitesNetworkBuilding2().setVisible(neighbourhoodBuilding2);
        getHlIgnoreMetabolitesNetworkBuilding2().setVisible(neighbourhoodBuilding2);
        getStxtIgnoreMetabolitesNetworkBuilding2().setVisible(neighbourhoodBuilding2 && sb.getIgnoreMetabolitesNetworkBuilding2File() != null);
        getBtnIgnoreMetabolitesNetworkBuilding2().setVisible(neighbourhoodBuilding2 && sb.getIgnoreMetabolitesNetworkBuilding2File() != null);

        // see if note regarding selected start/end metabolties is to be displayed
        if (!sb.getSelectedOptionDataset().equals(Parameter.OPTION_DATASET_OPTION_COMPLETE)) {
            stxtStartMetabolitesNote.setText("Note: Only metabolites present in selected pathway maps are available for pathway prediction");
            stxtEndMetabolitesNote.setText("Note: Only metabolites present in selected pathway maps are available for pathway prediction");
        } else {
            stxtStartMetabolitesNote.setText(null);
            stxtEndMetabolitesNote.setText(null);
            
        }
        
        // Set pathway related components' visibility
        boolean pathwayAnalysis = sb.getSelectedAnalysis().equals(Parameter.OPTION_ANALYSIS_PATHWAY);
        pathwayAnalysis = pathwayAnalysis || (sb.getSelectedAnalysis().equals(Parameter.OPTION_ANALYSIS_COMPARATIVE) && sb.getSelectedComparisonMode() != null && sb.getSelectedComparisonMode().equals(Parameter.OPTION_COMPARISON_MODE_PATHWAY));
        getLoPathwayParameters().setVisible(pathwayAnalysis);

        if (pathwayAnalysis) {
            // show the connection option panel if required
            boolean showConnectionOptions = getSessionBean1().getSelectedPathwayPredictionMode().equals(Parameter.OPTION_PREDICTION_MODE_CONNECTION);
            getLblConnectionOption().setVisible(showConnectionOptions);
            getHlConnectionOption().setVisible(showConnectionOptions);
            getRbgConnectionOption().setVisible(showConnectionOptions);

            // show the connection file panel if required
            boolean showConnectionFile = getSessionBean1().getSelectedConnectionOption().equals(Parameter.OPTION_CONNECTION_OPTION_FILE);
            getLblConnectionFile().setVisible(showConnectionFile);
            getFileConnections().setVisible(showConnectionFile);
            getStxtConnectionFile().setVisible(showConnectionFile);
            getStxtConnectionFileStatus().setVisible(showConnectionFile && sb.getConnectionFile() != null);
            getBtnConnectionFile().setVisible(showConnectionFile && sb.getConnectionFile() != null);

            // set optional constraints
            getStxtIgnoreMetabolitesFile().setVisible(sb.getIgnoreMetabolitesFile() != null);
            getBtnIgnoreMetabolitesFile().setVisible(sb.getIgnoreMetabolitesFile() != null);
            getStxtRequiredElementsFile().setVisible(sb.getRequiredElementsFile() != null);
            getBtnRequiredElementsFile().setVisible(sb.getRequiredElementsFile() != null);


            // show the return value panel if required
            boolean returnChoice = sb.getSelectedAnalysis().equals(Parameter.OPTION_ANALYSIS_PATHWAY) & sb.getSelectedAnalysisType().equals(Parameter.OPTION_ANALYSIS_TYPE_PREDICTION);
            returnChoice = returnChoice || (sb.getSelectedAnalysis().equals(Parameter.OPTION_ANALYSIS_COMPARATIVE) & sb.getSelectedComparisonMode().equals(Parameter.OPTION_COMPARISON_MODE_PATHWAY));
            getLoReturnValue().setVisible(returnChoice);

        }

        setHelpTexts();
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

    public void rbgOrganism1_processValueChange(ValueChangeEvent vce) {
        // save the selected organism 1 option 
        getSessionBean1().setSelectedOptionOrganism1((String) rbgOrganism1.getSelected());

// Following lines are to be used once the add/remove component supports client side rendering.
// When uncommented, auto-submit on change option should be unchecked for this component        
// Also the OnClick() method should have this line ... refreshForOrganism1('form1:loParameters:loOrganism1:loOrganism1Options:rbgOrganism1'); 
//        // show select organism 1 panel only if required
//        boolean showSelectOrganism1Panel = getSessionBean1().getSelectedOptionOrganism1().equals(Parameter.OPTION_ORGANISM_OPTION_SELECT);
//        updateVisibility(loSelectOrganism1.getChildren().iterator(), showSelectOrganism1Panel);
    }

    public void rbgPathwayPredictionMode_processValueChange(ValueChangeEvent vce) {
        // save the selected pathway prediction mode
        getSessionBean1().setSelectedPathwayPredictionMode((String) rbgPathwayPredictionMode.getSelected());

        // show the connection option panel if required
        boolean showConnectionOptions = getSessionBean1().getSelectedPathwayPredictionMode().equals(Parameter.OPTION_PREDICTION_MODE_CONNECTION);
        updateVisibility(loConnectionOption.getChildren().iterator(), showConnectionOptions);
    }

    public void rbgOrganism2_processValueChange(ValueChangeEvent vce) {
        // save the selected organism 2 option 
        getSessionBean1().setSelectedOptionOrganism2((String) rbgOrganism2.getSelected());

// Following lines are to be used once the add/remove component supports client side rendering.
// When uncommented, auto-submit on change option should be unchecked for this component        
// Also the OnClick() method should have this line ... refreshForOrganism2('form1:loParameters:loOrganism2:loOrganism2Options:rbgOrganism2');
//        // show select organism 2 panel only if required
//        boolean showSelectOrganism2Panel = getSessionBean1().getSelectedOptionOrganism2().equals(Parameter.OPTION_ORGANISM_OPTION_SELECT);
//        updateVisibility(loSelectOrganism2.getChildren().iterator(), showSelectOrganism2Panel);
    }

    public String btnBack_action() {
        return "Back To Main";
    }

    public String btnSubmit_action() {
        boolean result = true;
        if (getLoPhylogeny().isVisible()) {
            result = validatePhylogeny();
        } else {
            result = validateOrganisms1();
            if (getLoOrganism2().isVisible()) {
                result = validateOrganisms2() && result;
            }
        }

        // validate network building parameters if they are visible
        if (txtNetworkCutoff1.isVisible()) {
            result = validateCutoffNeighbourhood1() && result;
        }
        if (txtNetworkCutoff2.isVisible()) {
            result = validateCutoffNeighbourhood2() && result;
        }
        refreshUploadFileNetworkBuilding();

        // validate pathway parameters if they are visible
        if (loPathwayParameters.isVisible()) {
            if (loStartMetabolites.isVisible()) {
                result = validateStartMetabolites() && result;
            }
            if (loEndMetabolites.isVisible()) {
                result = validateEndMetabolites() && result;
            }
            if (loCutoffLength.isVisible()) {
                result = validateCutoffLength() && result;
            }
            if (fileConnections.isVisible()) {
                result = validateConnectionFile() && result;
            }
        }

        if (!result) {// there was some error .. stay on the same page
            return null;
        } else {

            refreshUploadedFiles();

            // otherwise submit the job and display job submitted page, if successful
            if ((new WebController()).submitJob(getSessionBean1())) {
                stxtJobSubmissionError.setText(null);
                return "Submitted";
            } else {
                stxtJobSubmissionError.setText("There was an error submitting the Job. Please try again later.");
                return null;
            }
        }
    }

    private boolean validateOrganisms1() {
        SessionBean1 sb = getSessionBean1();
        if (sb.getSelectedOptionOrganism1().equals(Parameter.OPTION_ORGANISM_OPTION_SELECT)) {
            if (!(new WebController()).validateOrganisms(sb, sb.getSelectedOrganisms1())) {
                if (sb.getSelectedAnalysisType().equals(Parameter.OPTION_ANALYSIS_TYPE_ALL_BUT_ONE)) {
                    getStxtOrganism1().setText("At least two organisms must be selected.");
                } else {
                    getStxtOrganism1().setText("At least one organism must be selected.");
                }
                return false;
            } else {
                getStxtOrganism1().setText(null);
                return true;
            }
        } else {
            getStxtOrganism1().setText(null);
            return true;
        }
    }

    private boolean validateOrganisms2() {
        SessionBean1 sb = getSessionBean1();
        if (sb.getSelectedOptionOrganism2().equals(Parameter.OPTION_ORGANISM_OPTION_SELECT)) {
            if (!(new WebController()).validateOrganisms(sb, sb.getSelectedOrganisms2())) {
                getStxtOrganism2().setText("At least one organism must be selected.");
                return false;
            } else {
                getStxtOrganism2().setText(null);
                return true;
            }
        } else {
            getStxtOrganism2().setText(null);
            return true;
        }
    }

    private boolean validatePhylogeny() {
        if (((String) txtPhylogeny.getText()).isEmpty()) {
            stxtPhylogeny.setText("A valid phylogeny must be specified.");
            return false;
        } else {
            String result = (new WebController()).validatePhylogeny(getSessionBean1(), PhyloTree.formatPhylogeny((String) txtPhylogeny.getText()));
            stxtPhylogeny.setText(result);
            return (result == null ? true : false);
        }
    }

    public boolean validateStartMetabolites() {
        SessionBean1 sb = getSessionBean1();
        if (!(new WebController()).validateStartMetabolites(sb, sb.getSelectedStartMetabolites())) {
            if (sb.getSelectedAnalysis().equals(Parameter.OPTION_ANALYSIS_PATHWAY) && sb.getSelectedAnalysisType().equals(Parameter.OPTION_ANALYSIS_TYPE_EXCLUSIVE_RXN)) {
                stxtStartMetabolites.setText("At least two start metabolites must be selected for this anaylsis.");
            } else {
                stxtStartMetabolites.setText("At least one start metabolite must be selected.");
            }
            return false;
        } else {
            stxtStartMetabolites.setText(null);
            return true;
        }
    }

    public boolean validateEndMetabolites() {
        WebController controller = new WebController();
        SessionBean1 sb = getSessionBean1();
        if (!controller.validateEndMetabolites(sb, sb.getSelectedEndMetabolites())) {
            stxtEndMetabolites.setText("At least one end metabolite must be selected.");
            return false;
        } else if (!controller.validateSelectedMetabolites(sb.getSelectedStartMetabolites(), sb.getSelectedEndMetabolites())) {
            stxtEndMetabolites.setText("Start and end metabolite sets must be exclusive.");
            return false;
        } else {
            stxtEndMetabolites.setText(null);
            return true;
        }
    }

    public boolean validateCutoffLength() {
        SessionBean1 sb = getSessionBean1();
        if (!(new WebController()).validateCutoffLength(((Integer) txtCutoffLength.getValue()).intValue(), sb)) {
            stxtCutoffLength.setText("Cutoff length must be between " + Integer.toString(sb.getSessionParameters().getMinCutoffLength()) + " and  " + Integer.toString(sb.getSessionParameters().getMaxCutoffLength()) + ".");
            return false;
        } else {
            stxtCutoffLength.setText(null);
            return true;
        }
    }

    public boolean validateCutoffNeighbourhood1() {
        SessionBean1 sb = getSessionBean1();
        if (!(new WebController()).validateCutoffProportionNeighbourhood(((Double) txtNetworkCutoff1.getValue()).doubleValue(), sb)) {
            stxtNetworkCutoff1.setText("Cutoff proportion must be greater than " + Double.toString(sb.getSessionParameters().getMinCutoffProportionNeighbourhood()) + " and less than " + Double.toString(sb.getSessionParameters().getMaxCutoffProportionNeighbourhood()) + ".");
            return false;
        } else {
            stxtNetworkCutoff1.setText(null);
            return true;
        }
    }

    public boolean validateCutoffNeighbourhood2() {
        SessionBean1 sb = getSessionBean1();
        if (!(new WebController()).validateCutoffProportionNeighbourhood(((Double) txtNetworkCutoff2.getValue()).doubleValue(), sb)) {
            stxtNetworkCutoff2.setText("Cutoff proportion must be greater than " + Double.toString(sb.getSessionParameters().getMinCutoffProportionNeighbourhood()) + " and less than " + Double.toString(sb.getSessionParameters().getMaxCutoffProportionNeighbourhood()) + ".");
            return false;
        } else {
            stxtNetworkCutoff2.setText(null);
            return true;
        }
    }

    private boolean validateConnectionFile() {
        if (fileConnections.getUploadedFile() == null || fileConnections.getUploadedFile().getOriginalName().isEmpty()) {
            stxtConnectionFile.setText("Connection file must be specified.");
            return false;
        } else {
            stxtConnectionFile.setText(null);
            return true;
        }
    }

    private void refreshUploadedFiles() {

        SessionBean1 sb = getSessionBean1();

        if (fileConnections.isVisible()) {
            if (fileConnections.getUploadedFile() != null && !fileConnections.getUploadedFile().getOriginalName().isEmpty())
                sb.setIgnoreMetabolitesFile(fileConnections.getUploadedFile().getAsString());
        } else {
            sb.setConnectionFile(null);
        }

        if (fileIgnoreMetabolites.isVisible()) {
            if (fileIgnoreMetabolites.getUploadedFile() != null && !fileIgnoreMetabolites.getUploadedFile().getOriginalName().isEmpty())
                sb.setIgnoreMetabolitesFile(fileIgnoreMetabolites.getUploadedFile().getAsString());
            else if (sb.isUseDefaultIgnoreMetabolites()){
                sb.setIgnoreMetabolitesFile(sb.getDefaultIgnoreMetabolitesList());
            }
        } else {
            sb.setIgnoreMetabolitesFile(null);
        }

        if (fileRequiredElements.isVisible()) {
            if (fileRequiredElements.getUploadedFile() != null && !fileRequiredElements.getUploadedFile().getOriginalName().isEmpty())
                sb.setRequiredElementsFile(fileRequiredElements.getUploadedFile().getAsString());
        } else {
            sb.setRequiredElementsFile(null);
        }
    }

    private void refreshUploadFileNetworkBuilding() {
        SessionBean1 sb = getSessionBean1();
        if (fileIgnoreMetabolitesNetworkBuilding1.isVisible()) {
            if (fileIgnoreMetabolitesNetworkBuilding1.getUploadedFile() != null && !fileIgnoreMetabolitesNetworkBuilding1.getUploadedFile().getOriginalName().isEmpty())
                sb.setIgnoreMetabolitesNetworkBuilding1File(fileIgnoreMetabolitesNetworkBuilding1.getUploadedFile().getAsString());
        } else {
            sb.setIgnoreMetabolitesNetworkBuilding1File(null);
        }
        if (fileIgnoreMetabolitesNetworkBuilding2.isVisible()) {
            if (fileIgnoreMetabolitesNetworkBuilding2.getUploadedFile() != null && !fileIgnoreMetabolitesNetworkBuilding2.getUploadedFile().getOriginalName().isEmpty())
                sb.setIgnoreMetabolitesNetworkBuilding2File(fileIgnoreMetabolitesNetworkBuilding2.getUploadedFile().getAsString());
        } else {
            sb.setIgnoreMetabolitesNetworkBuilding2File(null);
        }
    }

    private void updateVisibility(Iterator it, boolean show) {
        if (it == null) {
            return;
        }

        while (it.hasNext()) {
            UIComponent component = (UIComponent) it.next();
            if (component != null) {
                if (component instanceof Label) {
                    ((Label) component).setVisible(show);
                } else if (component instanceof Hyperlink) {
                    ((Hyperlink) component).setVisible(show);
                } else if (component instanceof RadioButtonGroup) {
                    ((RadioButtonGroup) component).setVisible(show);
                } else if (component instanceof DropDown) {
                    ((DropDown) component).setVisible(show);
                } else if (component instanceof StaticText) {
                    ((StaticText) component).setVisible(show);
                } else if (component instanceof Upload) {
                    ((Upload) component).setVisible(show);
                } else if (component instanceof PanelLayout) {
                    updateVisibility(((PanelLayout) component).getChildren().iterator(), show);
                } else if (component instanceof PanelGroup) {
                    updateVisibility(((PanelGroup) component).getChildren().iterator(), show);
                }
            }
        }

    }

    public void rbgConnectionOption_processValueChange(ValueChangeEvent vce) {
        // save the selected connection option
        getSessionBean1().setSelectedConnectionOption((String) rbgConnectionOption.getSelected());
        // show the connection file panel if required
        boolean showConnectionFile = getSessionBean1().getSelectedConnectionOption().equals(Parameter.OPTION_CONNECTION_OPTION_FILE);
        updateVisibility(loConnectionFile.getChildren().iterator(), showConnectionFile);
    }

    public String btnHelp_action() {
        // TODO: Replace with your code
        return null;
    }

    public String btnAbout_action() {
        // TODO: Replace with your code
        return null;
    }

    public String hlPhylogeny_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String hlOrganism1_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String hlOrganism1Mode_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String hlOrganism2_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String hlOrganism2Mode_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String hlStartMetabolites_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String hlEndMetabolites_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String hlPathwayPredictionMode_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String hlConnectionOption_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String hlCutoffLength_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String hlOptionalConstraints_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String hlReturnValue_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public void drpOrganism1Set_processValueChange(ValueChangeEvent event) {
        getSessionBean1().setSelectedOrganism1Set(getDrpOrganism1Set().getSelected().toString());
        String[] selectedOrganisms = (String[]) getArOrganism1().getSelected();
        if (selectedOrganisms == null) {
            selectedOrganisms = new String[]{};
        }
        getSessionBean1().setSelectedOrganisms1(selectedOrganisms);
        // refresh the organisms
        (new WebController()).refreshOrganism1List(getSessionBean1());
    }

    public void drpOrganism2Set_processValueChange(ValueChangeEvent event) {
        getSessionBean1().setSelectedOrganism2Set(getDrpOrganism2Set().getSelected().toString());
        String[] selectedOrganisms = (String[]) getArOrganism2().getSelected();
        if (selectedOrganisms == null) {
            selectedOrganisms = new String[]{};
        }
        getSessionBean1().setSelectedOrganisms2(selectedOrganisms);
        // refresh the organisms
        (new WebController()).refreshOrganism2List(getSessionBean1());
    }

    public void drpStartMetaboliteSet_processValueChange(ValueChangeEvent event) {
        getSessionBean1().setSelectedStartMetaboliteSet(getDrpStartMetaboliteSet().getSelected().toString());
        String[] selectedMetabolites = (String[]) getArStartMetabolites().getSelected();
        if (selectedMetabolites == null) {
            selectedMetabolites = new String[]{};
        }
        getSessionBean1().setSelectedStartMetabolites(selectedMetabolites);
        // refresh the metabolites
        (new WebController()).refreshStartMetabolites(getSessionBean1());
    }

    public void drpEndMetaboliteSet_processValueChange(ValueChangeEvent event) {
        getSessionBean1().setSelectedEndMetaboliteSet(getDrpEndMetaboliteSet().getSelected().toString());
        String[] selectedMetabolites = (String[]) getArEndMetabolites().getSelected();
        if (selectedMetabolites == null) {
            selectedMetabolites = new String[]{};
        }
        getSessionBean1().setSelectedEndMetabolites(selectedMetabolites);
        // refresh the metabolites
        (new WebController()).refreshEndMetabolites(getSessionBean1());
    }

    public void rbgOrganism1Mode_processValueChange(ValueChangeEvent vce) {
        SessionBean1 sb = getSessionBean1();
        sb.setSelectedOrganism1Mode((String) rbgOrganism1Mode.getSelected());

//        // Set network building parameters visibility
//        boolean neighbourhoodBuilding = sb.getSelectedOrganism1Mode().equals(Parameter.OPTION_NETWORK_BUILDING_NEIGHBOURHOOD);
//        updateVisibility(loNPOrganism1.getChildren().iterator(), neighbourhoodBuilding);
    }

    public void rbgOrganism2Mode_processValueChange(ValueChangeEvent vce) {
        SessionBean1 sb = getSessionBean1();
        sb.setSelectedOrganism2Mode((String) rbgOrganism1Mode.getSelected());

//        // Set network building parameters visibility
//        boolean neighbourhoodBuilding = sb.getSelectedOrganism2Mode().equals(Parameter.OPTION_NETWORK_BUILDING_NEIGHBOURHOOD);
//        updateVisibility(loNPOrganism2.getChildren().iterator(), neighbourhoodBuilding);
    }

    public void fileIgnoreMetabolitesNetworkBuilding1_processValueChange(ValueChangeEvent event) {
        SessionBean1 sb = getSessionBean1();
        if (fileIgnoreMetabolitesNetworkBuilding1.getUploadedFile() != null && !fileIgnoreMetabolitesNetworkBuilding1.getUploadedFile().getOriginalName().isEmpty()) {
            sb.setIgnoreMetabolitesNetworkBuilding1File(fileIgnoreMetabolitesNetworkBuilding1.getUploadedFile().getAsString());
            getStxtIgnoreMetabolitesNetworkBuilding1().setText("File '" + fileIgnoreMetabolitesNetworkBuilding1.getUploadedFile().getOriginalName() + "' uploaded successfully.");
        }
    }

    public String btnIgnoreMetabolitesNetworkBuilding1_action() {
        getSessionBean1().setIgnoreMetabolitesNetworkBuilding1File(null);
        getStxtIgnoreMetabolitesNetworkBuilding1().setText(null);
        getBtnIgnoreMetabolitesNetworkBuilding1().setVisible(false);
        return null;
    }

    public String btnIgnoreMetabolitesNetworkBuilding2_action() {
        getSessionBean1().setIgnoreMetabolitesNetworkBuilding2File(null);
        getStxtIgnoreMetabolitesNetworkBuilding2().setText(null);
        getBtnIgnoreMetabolitesNetworkBuilding2().setVisible(false);
        return null;
    }

    public void fileIgnoreMetabolitesNetworkBuilding2_processValueChange(ValueChangeEvent event) {
        SessionBean1 sb = getSessionBean1();
        if (fileIgnoreMetabolitesNetworkBuilding2.getUploadedFile() != null && !fileIgnoreMetabolitesNetworkBuilding2.getUploadedFile().getOriginalName().isEmpty()) {
            sb.setIgnoreMetabolitesNetworkBuilding2File(fileIgnoreMetabolitesNetworkBuilding2.getUploadedFile().getAsString());
            getStxtIgnoreMetabolitesNetworkBuilding2().setText("File '" + fileIgnoreMetabolitesNetworkBuilding2.getUploadedFile().getOriginalName() + "' uploaded successfully.");
        }
    }

    public void fileConnections_processValueChange(ValueChangeEvent event) {
        SessionBean1 sb = getSessionBean1();
        if (fileConnections.getUploadedFile() != null && !fileConnections.getUploadedFile().getOriginalName().isEmpty()) {
            sb.setConnectionFile(fileConnections.getUploadedFile().getAsString());
            getStxtConnectionFileStatus().setText("File '" + fileConnections.getUploadedFile() + "' uploaded successfully.");
        }
    }

    public String btnConnectionFile_action() {
        getSessionBean1().setConnectionFile(null);
        getStxtConnectionFileStatus().setText(null);
        getBtnConnectionFile().setVisible(false);
        return null;
    }

    public void fileIgnoreMetabolites_processValueChange(ValueChangeEvent event) {
        SessionBean1 sb = getSessionBean1();
        if (fileIgnoreMetabolites.getUploadedFile() != null && !fileIgnoreMetabolites.getUploadedFile().getOriginalName().isEmpty()) {
            sb.setIgnoreMetabolitesFile(fileIgnoreMetabolites.getUploadedFile().getAsString());
            getStxtIgnoreMetabolitesFile().setText("File '" + fileIgnoreMetabolites.getUploadedFile().getOriginalName() + "' uploaded successfully.");

            // hide the 'use default list checkbox'
            chkUseDefaultIgnoreMetabolites.setVisible(false);
        } else {
            // show the 'use default list checkbox'
            chkUseDefaultIgnoreMetabolites.setVisible(true);
        }
    }

    public String btnIgnoreMetabolitesFile_action() {
        getSessionBean1().setIgnoreMetabolitesFile(null);
        getStxtIgnoreMetabolitesFile().setText(null);
        getBtnIgnoreMetabolitesFile().setVisible(false);
        return null;
    }

    public void fileRequiredElements_processValueChange(ValueChangeEvent event) {
        SessionBean1 sb = getSessionBean1();
        if (fileRequiredElements.getUploadedFile() != null && !fileRequiredElements.getUploadedFile().getOriginalName().isEmpty()) {
            sb.setRequiredElementsFile(fileRequiredElements.getUploadedFile().getAsString());
            getStxtRequiredElementsFile().setText("File '" + fileRequiredElements.getUploadedFile().getOriginalName() + "' uploaded successfully.");
        }
    }

    public String btnRequiredElementsFile_action() {
        getSessionBean1().setRequiredElementsFile(null);
        getStxtRequiredElementsFile().setText(null);
        getBtnRequiredElementsFile().setVisible(false);
        return null;
    }

    private void setHelpTexts() {
        SessionBean1 sb = getSessionBean1();
        new WebController().setHelpTextsParametersPage(sb);
    }

    public void chkUseDefaultIgnoreMetabolites_processValueChange(ValueChangeEvent event) {
        SessionBean1 sb = getSessionBean1();
        sb.setUseDefaultIgnoreMetabolites(chkUseDefaultIgnoreMetabolites.isChecked());
    }
}

