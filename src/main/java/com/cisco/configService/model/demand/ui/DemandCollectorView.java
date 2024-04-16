package com.cisco.configService.model.demand.ui;


import com.cisco.configService.model.ConfigParams;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@EqualsAndHashCode(callSuper = true)
public class DemandCollectorView extends ConfigParams {

    private List<DemandStepView> demandSteps = new ArrayList<DemandStepView>();

}
