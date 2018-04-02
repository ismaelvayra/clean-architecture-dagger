package com.template.clean.cleanarchitecturetemplate.domain.usecase;

import com.template.clean.cleanarchitecturetemplate.domain.model.SampleEntity;
import com.template.clean.cleanarchitecturetemplate.domain.usecase.base.BaseUseCase;

/**
 * Created by Ismael Vayra on 1/4/2018.
 */

public class SampleUseCase extends BaseUseCase {

    public SampleUseCase() {}

    public SampleEntity getSampleEntity() {
        return new SampleEntity("New Entity", "EntityType");
    }
}
