package com.blastfurnace.otr.fileservice.adapter;


import com.blastfurnace.otr.api.response.GenericResponse;
import com.blastfurnace.otr.data.audiofile.model.AudioFileProperties;

public interface FileDataAdapter {

	GenericResponse<AudioFileProperties> get(Long id);

	

}