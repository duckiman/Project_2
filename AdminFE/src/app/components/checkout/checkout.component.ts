import { Component, OnInit } from '@angular/core';
import {CartService} from "../../services/cart.service";
import {OrderService} from "../../services/order.service";
import {Router} from "@angular/router";
import {CartModelServer} from "../../models/cart.model";
import {NgxSpinnerService} from "ngx-spinner";

@Component({
  selector: 'app-checkout',
  templateUrl: './checkout.component.html',
  styleUrls: ['./checkout.component.css']
})
export class CheckoutComponent implements OnInit {
  cartData:CartModelServer = {} as CartModelServer;
  cartTotal :Number = 0;
  constructor(private cartService: CartService,
              private orderService: OrderService,
              private router: Router,
              private spinner:NgxSpinnerService
              ) { }

  ngOnInit(): void {
    this.cartService.cartDataObs$.subscribe(data => this.cartData = data);
    this.cartService.cartTotal$.subscribe(total => this.cartTotal = total);
  }

  onCheckout() {
    this.spinner.show().then(p => {
      this.cartService.CheckoutFromCart(1);
    });
  }
}
