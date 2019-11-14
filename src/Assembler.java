// LC-3 ISA ASSEMBLER
// by lmlower for CSM 3670

import java.util.*;
import java.nio.file.*;
import java.io.*;

public class Assembler {

    // define exit codes
    private static final int EXIT_BAD_ARG = 1, EXIT_BAD_READ = 2;

    public static void main(String[] args){

        // check usage
        if(args.length < 1){
            System.err.println("Whoopsie! You didn't give me a file.");
            System.exit(EXIT_BAD_ARG);
            return;
        }

        System.out.println("LC-3 Assembler");

        // read in file
        final List<String> lines;
        try{
            lines = Files.readAllLines(Paths.get(args[0]));
        }
        catch(IOException ex){
            System.err.printf("Unable to read %s!\n", args[0]);
            System.exit(EXIT_BAD_READ);
            return;
        }

        for(String line : lines){
            System.out.println(line);
        }

    }

}
