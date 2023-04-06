package com.jfc.lambda;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class ForEachWriteFile {

    public static void main(String[] args) {

        Path path = Paths.get("C:\\temp");
        ForEachWriteFile obj = new ForEachWriteFile();

        obj.saveUgly(path, obj.createDummyFiles());
        obj.saveThreadSafeIOException(path, obj.createDummyFiles());
        obj.createDummyFiles().forEach(o -> obj.saveFile(path, o));

    }

    public void saveUgly(Path path, List<DummyFile> files) {

        if (!Files.isDirectory(path)) {
            throw new IllegalArgumentException("Path must be a directory");
        }

        files.forEach(f -> {
            try {
                int id = f.getId();
                // create a filename
                String fileName = id + ".txt";
                Files.write(path.resolve(fileName),
                        f.getContent().getBytes(StandardCharsets.UTF_8));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }

    public void saveThreadSafeIOException(Path path, List<DummyFile> files) {

        if (!Files.isDirectory(path)) {
            throw new IllegalArgumentException("Path must be a directory");
        }

        files.forEach(f -> {
            saveFile(path, f);//Potential Exceptions in extracted Method
        });

    }

    private static void saveFile(Path path, DummyFile f) {
        try {
            int id = f.getId();
            // create a filename
            String fileName = id + ".txt";
            Files.write(path.resolve(fileName),
                    f.getContent().getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public List<DummyFile> createDummyFiles() {
        return Arrays.asList(
                new DummyFile(1, "hello"),
                new DummyFile(2, "world"),
                new DummyFile(3, "java"));
    }

    class DummyFile {
        int id;
        String content;

        public DummyFile(int id, String content) {
            this.id = id;
            this.content = content;
        }

        public int getId() {
            return id;
        }

        public String getContent() {
            return content;
        }
    }
}
