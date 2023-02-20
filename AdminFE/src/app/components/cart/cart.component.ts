import { Component, OnInit } from '@angular/core';
import {CartModelServer} from "../../models/cart.model";
import {CartService} from "../../services/cart.service";

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.scss']
})
export class CartComponent implements OnInit {

  cartData:CartModelServer = {} as CartModelServer;
  cartTotal :Number = 0;
  // subTotal: Number;

  constructor(public cartService: CartService) {
  }

  ngOnInit() {
    this.cartService.cartDataObs$.subscribe(data => this.cartData = data);
    this.cartService.cartTotal$.subscribe(total => this.cartTotal = total);
  }

  ChangeQuantity(index: Number, increaseQuantity: Boolean) {
    // @ts-ignore
    this.cartService.UpdateCartData(index, increaseQuantity);
  }
}
