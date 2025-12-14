import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StyleTreeWithMenu extends JFrame {

    public StyleTreeWithMenu() {
        setTitle("Style Tree with Menu");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // === Menu Bar ===
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        exitItem.addActionListener(e -> System.exit(0));

        // Optional feedback for other items
        newItem.addActionListener(e -> JOptionPane.showMessageDialog(this, "New selected"));
        openItem.addActionListener(e -> JOptionPane.showMessageDialog(this, "Open selected"));
        saveItem.addActionListener(e -> JOptionPane.showMessageDialog(this, "Save selected"));

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        // === JTree ===
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Style");

        DefaultMutableTreeNode color = new DefaultMutableTreeNode("Color");
        color.add(new DefaultMutableTreeNode("Red"));
        color.add(new DefaultMutableTreeNode("Blue"));
        color.add(new DefaultMutableTreeNode("Black"));
        color.add(new DefaultMutableTreeNode("Green"));

        DefaultMutableTreeNode font = new DefaultMutableTreeNode("Font");
        // You can add font children later if desired

        root.add(color);
        root.add(font);

        JTree tree = new JTree(root);
        tree.setShowsRootHandles(true);

        add(new JScrollPane(tree));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new StyleTreeWithMenu().setVisible(true);
        });
    }
}