package com.bullhornsdk.data.model.response.list;

import com.bullhornsdk.data.model.entity.file.CandidateFileAttachment;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author Murray
 * @since 14/08/2017
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "count", "start" })
public class CandidateFileAttachmentListWrapper extends StandardListWrapper<CandidateFileAttachment> {
}
