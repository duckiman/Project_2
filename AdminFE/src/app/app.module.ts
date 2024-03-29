import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

//import { HttpModule } from '@angular/http';
import { HttpClientModule } from '@angular/common/http';
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { CartComponent } from './components/cart/cart.component';
import { CheckoutComponent } from './components/checkout/checkout.component';
import { HomeComponent } from './components/home/home.component';
import { ProductComponent } from './components/product/product.component';
import { ThankyouComponent } from './components/thankyou/thankyou.component';
import {NgxSpinnerModule} from "ngx-spinner";
import {ToastrModule} from "ngx-toastr";
import {NgxCurrencyModule} from "ngx-currency";

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    CartComponent,
    CheckoutComponent,
    HomeComponent,
    ProductComponent,
    ThankyouComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
//    HttpModule,
    HttpClientModule,
    NgxSpinnerModule,
    ToastrModule.forRoot(),
    NgxCurrencyModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
