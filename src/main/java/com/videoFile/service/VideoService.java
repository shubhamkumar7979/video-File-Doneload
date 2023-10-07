package com.videoFile.service;

import com.videoFile.entity.Video;
import com.videoFile.reprository.VideoRepository;
import org.springframework.stereotype.Service;

@Service
public class VideoService {

    private VideoRepository videoRepository;

    public VideoService(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    public void downloadVideo(String videoId) {

        Video video = videoRepository.findById(videoId).orElse(null);

        if (video != null) {
            video.setDownloadStatus("Downloading...");
            videoRepository.save(video);
        }
    }

    public void uploadVideo(String videoId, String destinationFolderId) {
        Video video = videoRepository.findById(videoId).orElse(null);

        if (video != null) {
            video.setUploadStatus("Uploading...");
            videoRepository.save(video);
        }
    }

    public Video getVideoById(String videoId) {
        return videoRepository.findById(videoId).orElse(null);
    }
}
