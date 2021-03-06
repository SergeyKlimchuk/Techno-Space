import { City } from 'src/models/map/city';
import { Roles } from './roles';
import { DeliveryAddress } from './address';

export class User {
  id: number;
  username: string;
  password: string;
  email: string;
  secondaryEmail: string;
  name: string;
  lastName: string;
  secondName: string;
  phoneNumber: string;
  roles: Roles[];
  city: City;
  addresses: DeliveryAddress[];
}
