package br.senai.sp.jandira.triproom.repository

import android.content.Context
import br.senai.sp.jandira.triproom.DAO.UsuariosDb
import br.senai.sp.jandira.triproom.model.Usuarios

class UsuariosRepository(context : Context) {
    private val db =  UsuariosDb.getBancoDeDados(context).usuariosDao()

    fun salvar(usuarios: Usuarios): Long{
        return db.salvar(usuarios)
    }

    fun buscarTodosOsUsuarios(): List<Usuarios>{
        return db.listarTodosOsUsuarios()
    }

    fun buscarUsuarioPeloId(id: Long): Usuarios{
        return db.listarUsuarioPeloId(id)
    }

    fun login(email: String, password: String): Pair<Boolean, Usuarios?>{
        val usuario = db.login(email, password)
            return Pair(usuario != null, usuario)
    }
}