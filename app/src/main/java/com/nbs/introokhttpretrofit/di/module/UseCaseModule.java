package com.nbs.introokhttpretrofit.di.module;

import com.nbs.introokhttpretrofit.data.libs.ApiConnection;
import com.nbs.introokhttpretrofit.domain.GetAllLeagueUseCase;

import dagger.Module;
import dagger.Provides;

@Module
public class UseCaseModule {
    @Provides
    GetAllLeagueUseCase provideGetAllLeagueUseCase(ApiConnection apiConnection){
        return new GetAllLeagueUseCase(apiConnection);
    }
}