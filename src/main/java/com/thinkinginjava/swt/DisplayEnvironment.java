/*package com.thinkinginjava.swt;

import com.thinkinginjava.swt.util.SWTApplication;
import com.thinkinginjava.swt.util.SWTConsole;
import org.eclipse.swt.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;

import java.awt.*;
import java.util.Map;

public class DisplayEnvironment implements SWTApplication {
    public void createContents(Composite parent) {
        parent.setLayout(new FillLayout());
        Text text = new Text(parent, SWT.WRAP | SWT.V_SCROLL);
        for (Map.Entry entry : System.getenv().entrySet()) {
            text.append(entry.getKey() + ": " +
                    entry.getValue() + "\n");
        }
    }

    public static void main(String[] args) {
        SWTConsole.run(new DisplayEnvironment(), 800, 600);
    }
} */
