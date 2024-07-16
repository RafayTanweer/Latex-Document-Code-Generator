
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdur-Rafay
 */
public class CreateCode {
    
    FileWriter fw;

    public CreateCode() throws IOException {
        this.fw = new FileWriter("Code.tex",false);
        fw.write("\\documentclass[a4paper]{article}\n" +
        "\n" +
        "\\usepackage[english]{babel}\n" +
        "\\usepackage[utf8]{inputenc}\n" +
        "\\usepackage{amsmath}\n" +
        "\\usepackage{graphicx}\n" +
        "\\usepackage[colorinlistoftodos]{todonotes}\n" +
        "\\usepackage[obeyspaces]{url}\n" +
        "%\\usepackage{hyperref}\n" +
        "\n" +
        "\\usepackage{setspace}\n" +
        "\\usepackage{listings}\n" +
        "\\usepackage{xcolor}\n" +
        "\n" +
        "\\definecolor{codegreen}{rgb}{0,0.6,0}\n" +
        "\\definecolor{codeblue}{rgb}{0,0,0.6}\n" +
        "\\definecolor{codegray}{rgb}{0.5,0.5,0.5}\n" +
        "\\definecolor{codepurple}{rgb}{0.58,0,0.82}\n" +
        "\\definecolor{backcolour}{rgb}{0.95,0.95,0.92}\n" +
        "\n" +
        "\\lstset{language=Java,\n" +
        "	backgroundcolor=\\color{backcolour},\n" +
        "	backgroundcolor=\\color{backcolour},   \n" +
        "	commentstyle=\\color{codegreen},\n" +
        "	keywordstyle=\\color{magenta},\n" +
        "	numberstyle=\\tiny\\color{codegray},\n" +
        "	stringstyle=\\color{codepurple},\n" +
        "	basicstyle=\\ttfamily\\footnotesize,\n" +
        "	breakatwhitespace=false,         \n" +
        "	breaklines=true,                 \n" +
        "	captionpos=b,                    \n" +
        "	keepspaces=true,                 \n" +
        "	numbers=left,                    \n" +
        "	numbersep=5pt,                  \n" +
        "	showspaces=false,                \n" +
        "	showstringspaces=false,\n" +
        "	showtabs=false,                  \n" +
        "	tabsize=2\n" +
        "}\n" + 
        "\n");
        
        
    }
    
    public void MakeTitle(String Course, String Topic, String Instructor, String Date) throws IOException{
        
       fw.write("\\title{" + Course + "\\\\ \\vspace{5mm}\n");
       fw.write("\\large " + Topic + "}\n");
       fw.write("\\author{Instructor: " + Instructor + "}\n");
       fw.write("\\date{" + Date + "}\n");
       fw.write("\\begin{document}\n");
       fw.write("\\maketitle\n");
        
    }
    
    public void createSection(String Title, String Description) throws IOException{
        
        fw.write("\\section{" + Title + "}\n");
        fw.write(Description + "\n");
        
        
    }
    
    public void createSubSection(String Title, String Description) throws IOException{
        
        fw.write("\\subsection{" + Title + "}\n");
        fw.write(Description + "\n");
        
    }
    
    public void BeginItemList() throws IOException{
        
        fw.write("\\begin{enumerate}\n");
        
    }
    
    public void AddItem(String Item) throws IOException{
        
        fw.write("\\item " + Item + "\n");
        
    }
    
    public void EndList() throws IOException{
        
        fw.write("\\end{enumerate}\n");
        
    }
    
    public void AddJavaCode(String Code) throws IOException{
        
        fw.write("\\begin{lstlisting}[language=Java]%, caption=Coding example]\n");
        fw.write("\n");
        fw.write(Code + "\n");
        fw.write("\\end{lstlisting}\n");
        
        
    }
    
    public void AddPath(String path) throws IOException{
        
        fw.write("\n");
        fw.write("\\vspace{5mm}\n");
        fw.write("\\path{" + path + "}\n");
        fw.write("\\vspace{5mm}\\\\" + "\n");
        
        
    }
    
    public void AddNormalText(String Text) throws IOException{
        
        fw.write(Text + "\n");
    
    }
    
    public void AddSpace(String AmountOfSpace) throws IOException{
        
        fw.write("\\vspace{" + AmountOfSpace + "mm}\\\\" + "\n");
        
    }
    
    public void EndDocument() throws IOException{
        
        fw.write("\\end{document}");
        
    }
    
    public void Close() throws IOException{
        
        fw.close();
        
    }
    
    public void ReadFile() throws FileNotFoundException{
        
        File FileObject = new File("Code.tex");
        Scanner sc = new Scanner(FileObject);
        
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            System.out.println(data);
        }
        
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println();
        
        
    }
    
    
}
