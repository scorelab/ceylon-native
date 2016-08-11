/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceylon.pkgnative;

/**
 *
 * @author tharindu
 */
import com.redhat.ceylon.compiler.java.runtime.tools.*;
import java.io.File;

public class run {
    public static void main(String[] args){
        CompilerOptions options = new CompilerOptions();
        options.addModule("com.example");

        CompilationListener listener = new CompilationListener(){
            @Override
            public void error(File file, long line, long column, String message){}
            @Override
            public void warning(File file, long line, long column, String message){}
            @Override
            public void moduleCompiled(String module, String version){}
        };

        Compiler jvmCompiler = CeylonToolProvider.getCompiler(Backend.Java);
        jvmCompiler.compile(options, listener);

        Compiler jsCompiler = CeylonToolProvider.getCompiler(Backend.JavaScript);
        jsCompiler.compile(options, listener);
    }
}
