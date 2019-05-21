package com.projects.services;

import org.springframework.http.HttpStatus;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.apache.commons.io.FileUtils;


public class CordisService {

    private static String FILE_URL = "http://cordis.europa.eu/data/cordis-h2020projects-xml.zip";
    private static String FILE_NAME = "/Users/roconstantin/Documents/university/Semestrul II/DAI/dai-homework/src/main/resources/tmp.zip";
    private HttpStatus status;
    private static URL redirectURL = null;

    public static void download() throws IOException {
        try {
            URL url = new URL(FILE_URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            if (connection.getResponseCode() == 301) {
                String redirectLocation = connection.getHeaderField("Location");
                if (redirectLocation == null) return;
                redirectURL = new URL(redirectLocation);
                try (BufferedInputStream in = new BufferedInputStream(redirectURL.openStream());
                     FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME)) {
                    byte dataBuffer[] = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                        fileOutputStream.write(dataBuffer, 0, bytesRead);
                    }
                } catch (IOException e) {
                    // handle exception
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copy(InputStream input, OutputStream output, int bufferSize) throws IOException {
        byte[] buf = new byte[bufferSize];
        int n = input.read(buf);
        while (n >= 0) {
            output.write(buf, 0, n);
            n = input.read(buf);
        }
        output.flush();
    }

    public static File newFile(File destinationDir, ZipEntry zipEntry) throws IOException {
        File destFile = new File(destinationDir, zipEntry.getName());

        String destDirPath = destinationDir.getCanonicalPath();
        String destFilePath = destFile.getCanonicalPath();

        if (!destFilePath.startsWith(destDirPath + File.separator)) {
            throw new IOException("Entry is outside of the target dir: " + zipEntry.getName());
        }

        return destFile;
    }

    public static void unzip() throws IOException {
        String fileZip = FILE_NAME;
        File destDir = new File("src/main/resources/tmp");
        FileUtils.cleanDirectory(destDir);
        byte[] buffer = new byte[1024];
        ZipInputStream zis = new ZipInputStream(new FileInputStream(fileZip));
        ZipEntry zipEntry = zis.getNextEntry();
        while (zipEntry != null) {
            File newFile = newFile(destDir, zipEntry);
            FileOutputStream fos = new FileOutputStream(newFile);
            int len;
            while ((len = zis.read(buffer)) > 0) {
                fos.write(buffer, 0, len);
            }
            fos.close();
            zipEntry = zis.getNextEntry();
        }
        zis.closeEntry();
        zis.close();
    }



}