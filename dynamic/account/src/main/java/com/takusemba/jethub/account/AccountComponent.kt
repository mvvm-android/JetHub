package com.takusemba.jethub.account

import android.content.Context
import com.takusemba.jethub.di.AccountModuleDependencies
import dagger.BindsInstance
import dagger.Component

/**
 * Hilt does not support injection for Dynamic Feature Module.
 * Therefore, this is a alternative way to archive injection for now.
 * https://developer.android.com/training/dependency-injection/hilt-multi-module#dfm
 */
@Component(dependencies = [AccountModuleDependencies::class])
interface AccountComponent {

  fun inject(fragment: AccountFragment)

  @Component.Builder
  interface Builder {

    fun context(@BindsInstance context: Context): Builder

    fun appDependencies(dependencies: AccountModuleDependencies): Builder

    fun build(): AccountComponent
  }
}