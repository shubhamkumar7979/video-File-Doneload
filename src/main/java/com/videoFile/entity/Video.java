package com.videoFile.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "video")
public class Video {

    public Video(String id, String title, String downloadStatus, String uploadStatus) {
        this.id = id;
        this.title = title;
        this.downloadStatus = downloadStatus;
        this.uploadStatus = uploadStatus;
    }

    @Id

    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private String id;

    private String title;

    private String downloadStatus;

    private String uploadStatus;

    public void setDownloadStatus(String s) {
    }

    public void setUploadStatus(String s) {
    }

    // You don't need to create constructors, getters, setters, or toString manually
    // Lombok annotations generate them for you
}
