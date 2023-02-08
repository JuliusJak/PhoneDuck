package com.example.phoneduck.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ChatRoomController {


    @GetMapping("/channels")
    public List<ChatRoom> getChannels() {
        // Implementation to retrieve a list of channels
    }



    @PostMapping("/channels")
    public ChatRoom createChannel(@RequestBody ChatRoom chatRoom) {
        // Implementation to create a new channel
    }


    @DeleteMapping("/channels/{id}")
    public void deleteChannel(@PathVariable("id") Long id) {
        // Implementation to delete a channel
    }

}
