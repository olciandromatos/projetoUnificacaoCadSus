import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { DataTableModule } from 'primeng/components/datatable/datatable';
import { HttpClientModule } from '@angular/common/http';
import { ButtonModule } from 'primeng/components/button/button';
import { TooltipModule } from 'primeng/components/tooltip/tooltip';

import { AppComponent } from './app.component';
import { ContainerComponent } from './container/container.component';

@NgModule({
  declarations: [
    AppComponent,
    ContainerComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    DataTableModule,
    ButtonModule,
    TooltipModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
