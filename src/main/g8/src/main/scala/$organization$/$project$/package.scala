/*
 * Copyright 2015 $author$
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package $organization$

package object $artifact$ {

  // format: OFF
  private[$artifact$] val Traversable = scala.collection.immutable.Traversable
  private[$artifact$] type Traversable[+A] = scala.collection.immutable.Traversable[A]

  private[$artifact$] val Iterable = scala.collection.immutable.Iterable
  private[$artifact$] type Iterable[+A] = scala.collection.immutable.Iterable[A]

  private[$artifact$] val Seq = scala.collection.immutable.Seq
  private[$artifact$] type Seq[+A] = scala.collection.immutable.Seq[A]

  private[$artifact$] val IndexedSeq = scala.collection.immutable.IndexedSeq
  private[$artifact$] type IndexedSeq[+A] = scala.collection.immutable.IndexedSeq[A]
  // format: ON
}
