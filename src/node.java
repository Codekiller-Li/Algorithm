import java.util.ArrayList;
import java.util.List;

public class node {
    private String text;
    private List<node>childList;
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public List<node> getChildList() {
        return childList;
    }
    public void setChildList(List<node> childList) {
        this.childList = childList;
    }
    public static node getInitNode()
    {
        node nodeA=new node();
        nodeA.setText("A");
        node nodeB=new node();
        nodeB.setText("B");
        node nodeC=new node();
        nodeC.setText("C");
        node nodeD=new node();
        nodeD.setText("D");
        node nodeE=new node();
        nodeE.setText("E");

        List<node>lstB=new ArrayList();
        lstB.add(nodeC);
        lstB.add(nodeD);
        nodeB.setChildList(lstB);

        List<node>lstA=new ArrayList();
        lstA.add(nodeB);
        lstA.add(nodeE);
        nodeA.setChildList(lstA);
        return nodeA;

    }
}
