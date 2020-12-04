// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.fragment_used_twice.fragment

import com.apollographql.apollo.api.GraphqlFragment
import com.apollographql.apollo.api.internal.ResponseFieldMarshaller
import com.example.fragment_used_twice.fragment.adapter.CharacterDetailsImpl_ResponseAdapter
import kotlin.Any
import kotlin.String

/**
 * A character from the Star Wars universe
 */
data class CharacterDetailsImpl(
  override val __typename: String = "Character",
  /**
   * The name of the character
   */
  override val name: String,
  /**
   * The date character was born.
   */
  override val birthDate: Any
) : CharacterDetail, GraphqlFragment {
  override fun marshaller(): ResponseFieldMarshaller {
    return ResponseFieldMarshaller { writer ->
      CharacterDetailsImpl_ResponseAdapter.toResponse(writer, this)
    }
  }
}