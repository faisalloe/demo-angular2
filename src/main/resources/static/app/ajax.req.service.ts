
import { Injectable }    from '@angular/core';
import { Http, URLSearchParams, Response } from '@angular/http';
import 'rxjs/add/operator/toPromise';



@Injectable()
export class AjaxRequestService {


    constructor(private http: Http){

        console.log(http)
    }

    incrementNumber(): Promise<number> {
        return this.http.get('/counter').toPromise()
            .then(response => parseInt(response.text()))
            .catch(this.handleError);
    }

    romanConverter(num: number): Promise<string> {

        let searchParams:URLSearchParams = new URLSearchParams();
        searchParams.set('num', num+"");


        return this.http.get('/romanNumber', {
            search: searchParams
        }).toPromise()
            .then(response => response.text())
            .catch(this.handleError);


    }

    addTwoNumbers(num1: number, num2: number): Promise<number> {


        //paramsMap

       let searchParams:URLSearchParams = new URLSearchParams();
        searchParams.set('firstNumber', num1+"");
        searchParams.set('secondNumber', num2+"");

        //new URLSearchParams('firstNumber='+num1 + '&secondNumber='+num2)

        return this.http.get('/adder', {
            search: searchParams
        }).toPromise()
            .then(response => parseInt(response.text()))
            .catch(this.handleError);
    }


    private handleError(error: any) {
        console.error('An error occurred', error);
        //error.message || error
        return Promise.reject(error);
    }

}
