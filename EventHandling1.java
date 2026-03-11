import javax.swing.*;

class EventHandling
{
    public static void main(String A[])
    {
        JFrame fobj = new JFrame("PPA");
        JButton bobj = new JButton("ok");

        bobj.setBounds(100,100,150,50);

        bobj.setActionListner(new ActionListner(){

            public void 
            actionPerformed(ActionEvent aobj)
            {
                System.out
            }
        })


        fobj.add(bobj);
        fobj.setSize(400,300);
        fobj.setLayout(null); // It is used to how button etc is arranged but we assigned null into it 
        fobj.setVisible(true);

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}