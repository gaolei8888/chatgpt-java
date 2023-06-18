package com.unfbx.chatgpt.entity.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RawChatChoice {
    private String text;

    private Integer index;

    @JsonProperty("logprobs")
    private String logProbs;

    @JsonProperty(value = "finish_reason")
    private String finishReason;
}
