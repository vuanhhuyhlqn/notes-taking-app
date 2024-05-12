package com.example.notestakingapp.utils;

import androidx.annotation.Nullable;

import com.example.notestakingapp.database.NoteComponent.Audio;
import com.example.notestakingapp.database.NoteComponent.Image;
import com.example.notestakingapp.database.NoteComponent.Note;
import com.example.notestakingapp.database.NoteComponent.Tag;
import com.example.notestakingapp.database.NoteComponent.TextSegment;

import java.util.List;

public class NoteDetailsComponent {
    private Note note;
    private List<TextSegment> textSegmentList;
    private List<Image> imageList;

    public NoteDetailsComponent(Note note, @Nullable List<TextSegment> textSegmentList, @Nullable List<Image> imageList, @Nullable List<Audio> audioList, @Nullable Tag tag) {
        this.note = note;
        this.textSegmentList = textSegmentList;
        this.imageList = imageList;
        this.audioList = audioList;
        this.tag = tag;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    public List<TextSegment> getTextSegmentList() {
        return textSegmentList;
    }

    public void setTextSegmentList(List<TextSegment> textSegmentList) {
        this.textSegmentList = textSegmentList;
    }

    public List<Image> getImageList() {
        return imageList;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }

    public List<Audio> getAudioList() {
        return audioList;
    }

    public void setAudioList(List<Audio> audioList) {
        this.audioList = audioList;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    private List<Audio> audioList;
    private Tag tag;
}