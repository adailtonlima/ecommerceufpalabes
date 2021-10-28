import * as dayjs from 'dayjs';
import { IEndereco } from 'app/entities/endereco/endereco.model';

export interface IUsuario {
  id?: number;
  nome?: string;
  cpf?: string | null;
  dataNascimento?: dayjs.Dayjs | null;
  criado?: dayjs.Dayjs | null;
  meusEnderecos?: IEndereco[] | null;
}

export class Usuario implements IUsuario {
  constructor(
    public id?: number,
    public nome?: string,
    public cpf?: string | null,
    public dataNascimento?: dayjs.Dayjs | null,
    public criado?: dayjs.Dayjs | null,
    public meusEnderecos?: IEndereco[] | null
  ) {}
}

export function getUsuarioIdentifier(usuario: IUsuario): number | undefined {
  return usuario.id;
}
