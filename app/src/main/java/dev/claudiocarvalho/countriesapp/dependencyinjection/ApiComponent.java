package dev.claudiocarvalho.countriesapp.dependencyinjection;

import dagger.Component;
import dev.claudiocarvalho.countriesapp.model.CountriesService;
import dev.claudiocarvalho.countriesapp.viewmodel.ListViewModel;

@Component(modules = {ApiModule.class})
public interface ApiComponent {

    void inject(CountriesService service);

    void inject(ListViewModel viewModel);
}
