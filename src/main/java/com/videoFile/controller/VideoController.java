package com.videoFile.controller;

import com.videoFile.entity.Video;
import com.videoFile.service.VideoService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/videos")
public class VideoController {

    private  VideoService videoService;


    @PostMapping("/download")
    public ResponseEntity<String> downloadVideo(@RequestParam String videoId) {
        // Initiate download process
        videoService.downloadVideo(videoId);
        return ResponseEntity.ok("Download process initiated for video with ID: " + videoId);
    }

    @PostMapping("/upload")
    public ResponseEntity<String> uploadVideo(
            @RequestParam String videoId,
            @RequestParam String destinationFolderId
    ) {
        // Initiate upload process
        videoService.uploadVideo(videoId, destinationFolderId);
        return ResponseEntity.ok("Upload process initiated for video with ID: " + videoId);
    }

    @GetMapping("/status/{videoId}")
    public ResponseEntity<?> getVideoStatus(@PathVariable String videoId) {
        // Get status for a specific video
        Video video = videoService.getVideoById(videoId);
vcxvcxvdvijo dfvnjxcvxc  di 
        if (video != null) {
            return ResponseEntity.ok(video);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
