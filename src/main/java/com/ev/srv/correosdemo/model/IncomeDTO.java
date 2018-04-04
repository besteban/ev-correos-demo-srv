package com.ev.srv.correosdemo.model;

import lombok.Builder;
import lombok.Data;
import com.ev.srv.correosdemo.model.IncomeRequestDTO;
import com.ev.srv.correosdemo.model.IncomeStatusDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;


/**
 * IncomeDTO
 */

@Data
@Builder
public class IncomeDTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("income")
  private IncomeRequestDTO income;
  
  @JsonProperty("status")
  private IncomeStatusDTO status;
  
}

