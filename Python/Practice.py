Python 3.11.5 (tags/v3.11.5:cce6ba9, Aug 24 2023, 14:38:34) [MSC v.1936 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
2+3
5
2+5
7
2 + 5
7
7
7



n
Traceback (most recent call last):
  File "<pyshell#7>", line 1, in <module>
    n
NameError: name 'n' is not defined
a=input()
String
print("Hello"+a)
HelloString
a=int(input())
234
print("Points "+a)
Traceback (most recent call last):
  File "<pyshell#11>", line 1, in <module>
    print("Points "+a)
TypeError: can only concatenate str (not "int") to str
print("points",a)
points 234
clear
Traceback (most recent call last):
  File "<pyshell#13>", line 1, in <module>
    clear
NameError: name 'clear' is not defined
cls
Traceback (most recent call last):
  File "<pyshell#14>", line 1, in <module>
    cls
NameError: name 'cls' is not defined
del
SyntaxError: incomplete input
delete
Traceback (most recent call last):
  File "<pyshell#16>", line 1, in <module>
    delete
NameError: name 'delete' is not defined
del
SyntaxError: incomplete input
8/4
2.0
5/2
2.5
4*5
20
20/6
3.3333333333333335
def he:
    
SyntaxError: incomplete input
5 // 5
1
8 //2
4
8 + 9 -4
13
10*5+4-3
51
10*5+8/2
54.0
(8+2)*2
20
2^3
1

2 ** 3
8
8**9
134217728
10 ** 8
100000000
10 ** 9
1000000000
10 ** 10
10000000000
10 % 7
3
"Gokula Kannan"
'Gokula Kannan'
a=input()
12.5
print(a)
12.5
b=int(input())
12.5
Traceback (most recent call last):
  File "<pyshell#40>", line 1, in <module>
    b=int(input())
ValueError: invalid literal for int() with base 10: '12.5'
print("Krish's Laptop")
Krish's Laptop
print('Krish "Laptop"')
Krish "Laptop"
print('Krish\'s "Laptop"')
Krish's "Laptop"
\
  l
SyntaxError: unexpected indent
print('c:\docs\gokul')
c:\docs\gokul
print("a\n b\t c")
a
 b	 c
print(r'c:\docs\nwin')
c:\docs\nwin
2 +5
7
a=2
b=34
print(a**b)
17179869184

==================== RESTART: C:/Users/gokul/OneDrive/Python/Var.py ====================
///simple terms
c:\docs\nwin
c:\docs
win
x=9
x+1
10
y=9
x+y
18
abc
Traceback (most recent call last):
  File "<pyshell#57>", line 1, in <module>
    abc
NameError: name 'abc' is not defined. Did you mean: 'abs'?
abs
<built-in function abs>
_+y
Traceback (most recent call last):
  File "<pyshell#59>", line 1, in <module>
    _+y
TypeError: unsupported operand type(s) for +: 'builtin_function_or_method' and 'int'
_+y
Traceback (most recent call last):
  File "<pyshell#60>", line 1, in <module>
    _+y
TypeError: unsupported operand type(s) for +: 'builtin_function_or_method' and 'int'
abc
Traceback (most recent call last):
  File "<pyshell#61>", line 1, in <module>
    abc
NameError: name 'abc' is not defined. Did you mean: 'abs'?
x=8
y=9
x+y
17
_+y
26
media='whatsapp'
media
'whatsapp'
media+
SyntaxError: incomplete input
media+' Chat'
'whatsapp Chat'
media[0]
'w'
 media=media+' chat'
 
SyntaxError: unexpected indent
media=media+' chat'
media
'whatsapp chat'
media[10]
'h'
media[-1]
't'
media[0:5]
'whats'

==================== RESTART: C:/Users/gokul/OneDrive/Python/Var.py ====================
///simple terms
c:\docs\nwin
c:\docs
win
Whatsapp
Selecting particular chararcters: Whats
hatsapp

==================== RESTART: C:/Users/gokul/OneDrive/Python/Var.py ====================
///simple terms
c:\docs\nwin
c:\docs
win
Whatsapp
Selecting particular chararcters: Whats
hatsapp
atsapp
len(media)
8
media
'Whatsapp'
n=[23,57,89,100]
n
[23, 57, 89, 100]
n[1:5]
[57, 89, 100]
n[3]
100
n[2:]
[89, 100]
n[-1:]
[100]
n[:-1]
[23, 57, 89]
name=['Kiran',12,'John']
name
['Kiran', 12, 'John']
mix=[n,name]
mix
[[23, 57, 89, 100], ['Kiran', 12, 'John']]
n.append
<built-in method append of list object at 0x000002133BACD640>
n.append(45)
n
[23, 57, 89, 100, 45]
n.insert(3,78)
n
[23, 57, 89, 78, 100, 45]
n.remove(3)
Traceback (most recent call last):
  File "<pyshell#95>", line 1, in <module>
    n.remove(3)
ValueError: list.remove(x): x not in list
n.remove(89)
n
[23, 57, 78, 100, 45]
n.pop(1)
57
n.pop()
45
del n[2:]
n
[23, 78]
n
[23, 78]
n.extend([12,45,67])
n
[23, 78, 12, 45, 67]
n.max()
Traceback (most recent call last):
  File "<pyshell#105>", line 1, in <module>
    n.max()
AttributeError: 'list' object has no attribute 'max'
min(n)
12
max(n)
78
sum(n)
225
pow(n)
Traceback (most recent call last):
  File "<pyshell#109>", line 1, in <module>
    pow(n)
TypeError: pow() missing required argument 'exp' (pos 2)
n.sort()
n
[12, 23, 45, 67, 78]
n.sort(-1)
Traceback (most recent call last):
  File "<pyshell#112>", line 1, in <module>
    n.sort(-1)
TypeError: sort() takes no positional arguments
n.sort()
n
[12, 23, 45, 67, 78]
n[-3]
45
tup = (23,34,56,78)
tup
(23, 34, 56, 78)
tup[1]
34
tup[1]=45
Traceback (most recent call last):
  File "<pyshell#119>", line 1, in <module>
    tup[1]=45
TypeError: 'tuple' object does not support item assignment
tup.count()
Traceback (most recent call last):
  File "<pyshell#120>", line 1, in <module>
    tup.count()
TypeError: tuple.count() takes exactly one argument (0 given)
tup.count
<built-in method count of tuple object at 0x000002133BAA3BF0>
tup.count(56)
1
tup.index(56)
2
s={34,67,89,90,34}
s
{89, 34, 67, 90}
s
{89, 34, 67, 90}
s.count(34)
Traceback (most recent call last):
  File "<pyshell#128>", line 1, in <module>
    s.count(34)
AttributeError: 'set' object has no attribute 'count'
s.symmetric_difference
<built-in method symmetric_difference of set object at 0x000002133BA76420>
w.symmetric_difference(34)
Traceback (most recent call last):
  File "<pyshell#130>", line 1, in <module>
    w.symmetric_difference(34)
NameError: name 'w' is not defined
s.symmetric_difference(34)
Traceback (most recent call last):
  File "<pyshell#131>", line 1, in <module>
    s.symmetric_difference(34)
TypeError: 'int' object is not iterable
s.add()
Traceback (most recent call last):
  File "<pyshell#132>", line 1, in <module>
    s.add()
TypeError: set.add() takes exactly one argument (0 given)
s.add(34,67)
Traceback (most recent call last):
  File "<pyshell#133>", line 1, in <module>
    s.add(34,67)
TypeError: set.add() takes exactly one argument (2 given)
s.add(34)
w
Traceback (most recent call last):
  File "<pyshell#135>", line 1, in <module>
    w
NameError: name 'w' is not defined
s
{89, 34, 67, 90}
s.add(78)
s
{34, 67, 78, 89, 90}
s.clear(78)
Traceback (most recent call last):
  File "<pyshell#139>", line 1, in <module>
    s.clear(78)
TypeError: set.clear() takes no arguments (1 given)
s.clear()
s
set()
s
set()
s.copy(34)
Traceback (most recent call last):
  File "<pyshell#143>", line 1, in <module>
    s.copy(34)
TypeError: set.copy() takes no arguments (1 given)
s.copy()
set()

==================== RESTART: C:/Users/gokul/OneDrive/Python/Var.py ====================
///simple terms
c:\docs\nwin
c:\docs
win
Whatsapp
Selecting particular chararcters: Whats
hatsapp
atsapp
Data Dictionary
{1: 'Krish', 2: 'Reddy', 3: 'Haris', 4: 'Vikram'}
data[3]
'Haris'
data[4]
'Vikram'
data[0]
Traceback (most recent call last):
  File "<pyshell#147>", line 1, in <module>
    data[0]
KeyError: 0
data.get(3)
'Haris'
data.get(0)
print(data.get(0))
None
data.get(0,'harish')
'harish'
data
{1: 'Krish', 2: 'Reddy', 3: 'Haris', 4: 'Vikram'}
data.get(0)
keys=['Krish','Loki','Viki']
values=['Python','Java','rubi']
data=dict(zip(keys,values))
data
{'Krish': 'Python', 'Loki': 'Java', 'Viki': 'rubi'}
data.update('Krish','Flutter')
Traceback (most recent call last):
  File "<pyshell#158>", line 1, in <module>
    data.update('Krish','Flutter')
TypeError: update expected at most 1 argument, got 2
data['Bharath']='CS'
data
{'Krish': 'Python', 'Loki': 'Java', 'Viki': 'rubi', 'Bharath': 'CS'}
data.update('Krish':'Shift')
SyntaxError: invalid syntax
data.update('Krish')
Traceback (most recent call last):
  File "<pyshell#162>", line 1, in <module>
    data.update('Krish')
ValueError: dictionary update sequence element #0 has length 1; 2 is required
data.update('Krish','K')
Traceback (most recent call last):
  File "<pyshell#163>", line 1, in <module>
    data.update('Krish','K')
TypeError: update expected at most 1 argument, got 2
data['Krish']
'Python'
prog={'JS':'Atom','CS':'VS','Python':['Pycharm','Sublime'],'Java':{'JSE':'Netbeans','JEE':'Eclipse'}}
prog['Java']
{'JSE': 'Netbeans', 'JEE': 'Eclipse'}
prog['Java'][1]
Traceback (most recent call last):
  File "<pyshell#167>", line 1, in <module>
    prog['Java'][1]
KeyError: 1
prog['Java']['JSE']
'Netbeans'
prog['Python'][2]
Traceback (most recent call last):
  File "<pyshell#169>", line 1, in <module>
    prog['Python'][2]
IndexError: list index out of range
prog['Python'][1:]
['Sublime']
help
Type help() for interactive help, or help(object) for help about object.
help()

Welcome to Python 3.11's help utility!

If this is your first time using Python, you should definitely check out
the tutorial on the internet at https://docs.python.org/3.11/tutorial/.

Enter the name of any module, keyword, or topic to get help on writing
Python programs and using Python modules.  To quit this help utility and
return to the interpreter, just type "quit".

To get a list of available modules, keywords, symbols, or topics, type
"modules", "keywords", "symbols", or "topics".  Each module also comes
with a one-line summary of what it does; to list the modules whose name
or summary contain a given string such as "spam", type "modules spam".

help> List
No Python documentation found for 'List'.
Use help() to get the interactive help utility.
Use help(str) for help on the str class.

help> topics

Here is a list of available topics.  Enter any topic name to get more help.

ASSERTION           DELETION            LOOPING             SHIFTING
ASSIGNMENT          DICTIONARIES        MAPPINGMETHODS      SLICINGS
ATTRIBUTEMETHODS    DICTIONARYLITERALS  MAPPINGS            SPECIALATTRIBUTES
ATTRIBUTES          DYNAMICFEATURES     METHODS             SPECIALIDENTIFIERS
AUGMENTEDASSIGNMENT ELLIPSIS            MODULES             SPECIALMETHODS
BASICMETHODS        EXCEPTIONS          NAMESPACES          STRINGMETHODS
BINARY              EXECUTION           NONE                STRINGS
BITWISE             EXPRESSIONS         NUMBERMETHODS       SUBSCRIPTS
BOOLEAN             FLOAT               NUMBERS             TRACEBACKS
CALLABLEMETHODS     FORMATTING          OBJECTS             TRUTHVALUE
CALLS               FRAMEOBJECTS        OPERATORS           TUPLELITERALS
CLASSES             FRAMES              PACKAGES            TUPLES
CODEOBJECTS         FUNCTIONS           POWER               TYPEOBJECTS
COMPARISON          IDENTIFIERS         PRECEDENCE          TYPES
COMPLEX             IMPORTING           PRIVATENAMES        UNARY
CONDITIONAL         INTEGER             RETURNING           UNICODE
CONTEXTMANAGERS     LISTLITERALS        SCOPING             
CONVERSIONS         LISTS               SEQUENCEMETHODS     
DEBUGGING           LITERALS            SEQUENCES           

help> DICTIONARIES
Mapping Types — "dict"
**********************

A *mapping* object maps *hashable* values to arbitrary objects.
Mappings are mutable objects.  There is currently only one standard
mapping type, the *dictionary*.  (For other containers see the built-
in "list", "set", and "tuple" classes, and the "collections" module.)

A dictionary’s keys are *almost* arbitrary values.  Values that are
not *hashable*, that is, values containing lists, dictionaries or
other mutable types (that are compared by value rather than by object
identity) may not be used as keys. Values that compare equal (such as
"1", "1.0", and "True") can be used interchangeably to index the same
dictionary entry.

class dict(**kwargs)
class dict(mapping, **kwargs)
class dict(iterable, **kwargs)

   Return a new dictionary initialized from an optional positional
   argument and a possibly empty set of keyword arguments.

   Dictionaries can be created by several means:

   * Use a comma-separated list of "key: value" pairs within braces:
     "{'jack': 4098, 'sjoerd': 4127}" or "{4098: 'jack', 4127:
     'sjoerd'}"

   * Use a dict comprehension: "{}", "{x: x ** 2 for x in range(10)}"

   * Use the type constructor: "dict()", "dict([('foo', 100), ('bar',
     200)])", "dict(foo=100, bar=200)"

   If no positional argument is given, an empty dictionary is created.
   If a positional argument is given and it is a mapping object, a
   dictionary is created with the same key-value pairs as the mapping
   object.  Otherwise, the positional argument must be an *iterable*
   object.  Each item in the iterable must itself be an iterable with
   exactly two objects.  The first object of each item becomes a key
   in the new dictionary, and the second object the corresponding
   value.  If a key occurs more than once, the last value for that key
   becomes the corresponding value in the new dictionary.

   If keyword arguments are given, the keyword arguments and their
   values are added to the dictionary created from the positional
   argument.  If a key being added is already present, the value from
   the keyword argument replaces the value from the positional
   argument.

   To illustrate, the following examples all return a dictionary equal
   to "{"one": 1, "two": 2, "three": 3}":

      >>> a = dict(one=1, two=2, three=3)
      >>> b = {'one': 1, 'two': 2, 'three': 3}
      >>> c = dict(zip(['one', 'two', 'three'], [1, 2, 3]))
      >>> d = dict([('two', 2), ('one', 1), ('three', 3)])
      >>> e = dict({'three': 3, 'one': 1, 'two': 2})
      >>> f = dict({'one': 1, 'three': 3}, two=2)
      >>> a == b == c == d == e == f
      True

   Providing keyword arguments as in the first example only works for
   keys that are valid Python identifiers.  Otherwise, any valid keys
   can be used.

   These are the operations that dictionaries support (and therefore,
   custom mapping types should support too):

   list(d)

      Return a list of all the keys used in the dictionary *d*.

   len(d)

      Return the number of items in the dictionary *d*.

   d[key]

      Return the item of *d* with key *key*.  Raises a "KeyError" if
      *key* is not in the map.

      If a subclass of dict defines a method "__missing__()" and *key*
      is not present, the "d[key]" operation calls that method with
      the key *key* as argument.  The "d[key]" operation then returns
      or raises whatever is returned or raised by the
      "__missing__(key)" call. No other operations or methods invoke
      "__missing__()". If "__missing__()" is not defined, "KeyError"
      is raised. "__missing__()" must be a method; it cannot be an
      instance variable:

         >>> class Counter(dict):
         ...     def __missing__(self, key):
         ...         return 0
         >>> c = Counter()
         >>> c['red']
         0
         >>> c['red'] += 1
         >>> c['red']
         1

      The example above shows part of the implementation of
      "collections.Counter".  A different "__missing__" method is used
      by "collections.defaultdict".

   d[key] = value

      Set "d[key]" to *value*.

   del d[key]

      Remove "d[key]" from *d*.  Raises a "KeyError" if *key* is not
      in the map.

   key in d

      Return "True" if *d* has a key *key*, else "False".

   key not in d

      Equivalent to "not key in d".

   iter(d)

      Return an iterator over the keys of the dictionary.  This is a
      shortcut for "iter(d.keys())".

   clear()

      Remove all items from the dictionary.

   copy()

      Return a shallow copy of the dictionary.

   classmethod fromkeys(iterable[, value])

      Create a new dictionary with keys from *iterable* and values set
      to *value*.

      "fromkeys()" is a class method that returns a new dictionary.
      *value* defaults to "None".  All of the values refer to just a
      single instance, so it generally doesn’t make sense for *value*
      to be a mutable object such as an empty list.  To get distinct
      values, use a dict comprehension instead.

   get(key[, default])

      Return the value for *key* if *key* is in the dictionary, else
      *default*. If *default* is not given, it defaults to "None", so
      that this method never raises a "KeyError".

   items()

      Return a new view of the dictionary’s items ("(key, value)"
      pairs). See the documentation of view objects.

   keys()

      Return a new view of the dictionary’s keys.  See the
      documentation of view objects.

   pop(key[, default])

      If *key* is in the dictionary, remove it and return its value,
      else return *default*.  If *default* is not given and *key* is
      not in the dictionary, a "KeyError" is raised.

   popitem()

      Remove and return a "(key, value)" pair from the dictionary.
      Pairs are returned in LIFO (last-in, first-out) order.

      "popitem()" is useful to destructively iterate over a
      dictionary, as often used in set algorithms.  If the dictionary
      is empty, calling "popitem()" raises a "KeyError".

      Changed in version 3.7: LIFO order is now guaranteed. In prior
      versions, "popitem()" would return an arbitrary key/value pair.

   reversed(d)

      Return a reverse iterator over the keys of the dictionary. This
      is a shortcut for "reversed(d.keys())".

      New in version 3.8.

   setdefault(key[, default])

      If *key* is in the dictionary, return its value.  If not, insert
      *key* with a value of *default* and return *default*.  *default*
      defaults to "None".

   update([other])

      Update the dictionary with the key/value pairs from *other*,
      overwriting existing keys.  Return "None".

      "update()" accepts either another dictionary object or an
      iterable of key/value pairs (as tuples or other iterables of
      length two).  If keyword arguments are specified, the dictionary
      is then updated with those key/value pairs: "d.update(red=1,
      blue=2)".

   values()

      Return a new view of the dictionary’s values.  See the
      documentation of view objects.

      An equality comparison between one "dict.values()" view and
      another will always return "False". This also applies when
      comparing "dict.values()" to itself:

         >>> d = {'a': 1}
         >>> d.values() == d.values()
         False

   d | other

      Create a new dictionary with the merged keys and values of *d*
      and *other*, which must both be dictionaries. The values of
      *other* take priority when *d* and *other* share keys.

      New in version 3.9.

   d |= other

      Update the dictionary *d* with keys and values from *other*,
      which may be either a *mapping* or an *iterable* of key/value
      pairs. The values of *other* take priority when *d* and *other*
      share keys.

      New in version 3.9.

   Dictionaries compare equal if and only if they have the same "(key,
   value)" pairs (regardless of ordering). Order comparisons (‘<’,
   ‘<=’, ‘>=’, ‘>’) raise "TypeError".

   Dictionaries preserve insertion order.  Note that updating a key
   does not affect the order.  Keys added after deletion are inserted
   at the end.

      >>> d = {"one": 1, "two": 2, "three": 3, "four": 4}
      >>> d
      {'one': 1, 'two': 2, 'three': 3, 'four': 4}
      >>> list(d)
      ['one', 'two', 'three', 'four']
      >>> list(d.values())
      [1, 2, 3, 4]
      >>> d["one"] = 42
      >>> d
      {'one': 42, 'two': 2, 'three': 3, 'four': 4}
      >>> del d["two"]
      >>> d["two"] = None
      >>> d
      {'one': 42, 'three': 3, 'four': 4, 'two': None}

   Changed in version 3.7: Dictionary order is guaranteed to be
   insertion order.  This behavior was an implementation detail of
   CPython from 3.6.

   Dictionaries and dictionary views are reversible.

      >>> d = {"one": 1, "two": 2, "three": 3, "four": 4}
      >>> d
      {'one': 1, 'two': 2, 'three': 3, 'four': 4}
      >>> list(reversed(d))
      ['four', 'three', 'two', 'one']
      >>> list(reversed(d.values()))
      [4, 3, 2, 1]
      >>> list(reversed(d.items()))
      [('four', 4), ('three', 3), ('two', 2), ('one', 1)]

   Changed in version 3.8: Dictionaries are now reversible.

See also:

  "types.MappingProxyType" can be used to create a read-only view of a
  "dict".


Dictionary view objects
=======================

The objects returned by "dict.keys()", "dict.values()" and
"dict.items()" are *view objects*.  They provide a dynamic view on the
dictionary’s entries, which means that when the dictionary changes,
the view reflects these changes.

Dictionary views can be iterated over to yield their respective data,
and support membership tests:

len(dictview)

   Return the number of entries in the dictionary.

iter(dictview)

   Return an iterator over the keys, values or items (represented as
   tuples of "(key, value)") in the dictionary.

   Keys and values are iterated over in insertion order. This allows
   the creation of "(value, key)" pairs using "zip()": "pairs =
   zip(d.values(), d.keys())".  Another way to create the same list is
   "pairs = [(v, k) for (k, v) in d.items()]".

   Iterating views while adding or deleting entries in the dictionary
   may raise a "RuntimeError" or fail to iterate over all entries.

   Changed in version 3.7: Dictionary order is guaranteed to be
   insertion order.

x in dictview

   Return "True" if *x* is in the underlying dictionary’s keys, values
   or items (in the latter case, *x* should be a "(key, value)"
   tuple).

reversed(dictview)

   Return a reverse iterator over the keys, values or items of the
   dictionary. The view will be iterated in reverse order of the
   insertion.

   Changed in version 3.8: Dictionary views are now reversible.

dictview.mapping

   Return a "types.MappingProxyType" that wraps the original
   dictionary to which the view refers.

   New in version 3.10.

Keys views are set-like since their entries are unique and *hashable*.
If all values are hashable, so that "(key, value)" pairs are unique
and hashable, then the items view is also set-like.  (Values views are
not treated as set-like since the entries are generally not unique.)
For set-like views, all of the operations defined for the abstract
base class "collections.abc.Set" are available (for example, "==",
"<", or "^").

An example of dictionary view usage:

   >>> dishes = {'eggs': 2, 'sausage': 1, 'bacon': 1, 'spam': 500}
   >>> keys = dishes.keys()
   >>> values = dishes.values()

   >>> # iteration
   >>> n = 0
   >>> for val in values:
   ...     n += val
   >>> print(n)
   504

   >>> # keys and values are iterated over in the same order (insertion order)
   >>> list(keys)
   ['eggs', 'sausage', 'bacon', 'spam']
   >>> list(values)
   [2, 1, 1, 500]

   >>> # view objects are dynamic and reflect dict changes
   >>> del dishes['eggs']
   >>> del dishes['sausage']
   >>> list(keys)
   ['bacon', 'spam']

   >>> # set operations
   >>> keys & {'eggs', 'bacon', 'salad'}
   {'bacon'}
   >>> keys ^ {'sausage', 'juice'} == {'juice', 'sausage', 'bacon', 'spam'}
   True
   >>> keys | ['juice', 'juice', 'juice'] == {'bacon', 'spam', 'juice'}
   True

   >>> # get back a read-only proxy for the original dictionary
   >>> values.mapping
   mappingproxy({'bacon': 1, 'spam': 500})
   >>> values.mapping['spam']
   500

Related help topics: DICTIONARYLITERALS

help> LIST
No Python documentation found for 'LIST'.
Use help() to get the interactive help utility.
Use help(str) for help on the str class.

help> LISTS
Mutable Sequence Types
**********************

The operations in the following table are defined on mutable sequence
types. The "collections.abc.MutableSequence" ABC is provided to make
it easier to correctly implement these operations on custom sequence
types.

In the table *s* is an instance of a mutable sequence type, *t* is any
iterable object and *x* is an arbitrary object that meets any type and
value restrictions imposed by *s* (for example, "bytearray" only
accepts integers that meet the value restriction "0 <= x <= 255").

+--------------------------------+----------------------------------+-----------------------+
| Operation                      | Result                           | Notes                 |
|================================|==================================|=======================|
| "s[i] = x"                     | item *i* of *s* is replaced by   |                       |
|                                | *x*                              |                       |
+--------------------------------+----------------------------------+-----------------------+
| "s[i:j] = t"                   | slice of *s* from *i* to *j* is  |                       |
|                                | replaced by the contents of the  |                       |
|                                | iterable *t*                     |                       |
+--------------------------------+----------------------------------+-----------------------+
| "del s[i:j]"                   | same as "s[i:j] = []"            |                       |
+--------------------------------+----------------------------------+-----------------------+
| "s[i:j:k] = t"                 | the elements of "s[i:j:k]" are   | (1)                   |
|                                | replaced by those of *t*         |                       |
+--------------------------------+----------------------------------+-----------------------+
| "del s[i:j:k]"                 | removes the elements of          |                       |
|                                | "s[i:j:k]" from the list         |                       |
+--------------------------------+----------------------------------+-----------------------+
| "s.append(x)"                  | appends *x* to the end of the    |                       |
|                                | sequence (same as                |                       |
|                                | "s[len(s):len(s)] = [x]")        |                       |
+--------------------------------+----------------------------------+-----------------------+
| "s.clear()"                    | removes all items from *s* (same | (5)                   |
|                                | as "del s[:]")                   |                       |
+--------------------------------+----------------------------------+-----------------------+
| "s.copy()"                     | creates a shallow copy of *s*    | (5)                   |
|                                | (same as "s[:]")                 |                       |
+--------------------------------+----------------------------------+-----------------------+
| "s.extend(t)" or "s += t"      | extends *s* with the contents of |                       |
|                                | *t* (for the most part the same  |                       |
|                                | as "s[len(s):len(s)] = t")       |                       |
+--------------------------------+----------------------------------+-----------------------+
| "s *= n"                       | updates *s* with its contents    | (6)                   |
|                                | repeated *n* times               |                       |
+--------------------------------+----------------------------------+-----------------------+
| "s.insert(i, x)"               | inserts *x* into *s* at the      |                       |
|                                | index given by *i* (same as      |                       |
|                                | "s[i:i] = [x]")                  |                       |
+--------------------------------+----------------------------------+-----------------------+
| "s.pop()" or "s.pop(i)"        | retrieves the item at *i* and    | (2)                   |
|                                | also removes it from *s*         |                       |
+--------------------------------+----------------------------------+-----------------------+
| "s.remove(x)"                  | remove the first item from *s*   | (3)                   |
|                                | where "s[i]" is equal to *x*     |                       |
+--------------------------------+----------------------------------+-----------------------+
| "s.reverse()"                  | reverses the items of *s* in     | (4)                   |
|                                | place                            |                       |
+--------------------------------+----------------------------------+-----------------------+

Notes:

1. *t* must have the same length as the slice it is replacing.

2. The optional argument *i* defaults to "-1", so that by default the
   last item is removed and returned.

3. "remove()" raises "ValueError" when *x* is not found in *s*.

4. The "reverse()" method modifies the sequence in place for economy
   of space when reversing a large sequence.  To remind users that it
   operates by side effect, it does not return the reversed sequence.

5. "clear()" and "copy()" are included for consistency with the
   interfaces of mutable containers that don’t support slicing
   operations (such as "dict" and "set"). "copy()" is not part of the
   "collections.abc.MutableSequence" ABC, but most concrete mutable
   sequence classes provide it.

   New in version 3.3: "clear()" and "copy()" methods.

6. The value *n* is an integer, or an object implementing
   "__index__()".  Zero and negative values of *n* clear the sequence.
   Items in the sequence are not copied; they are referenced multiple
   times, as explained for "s * n" under Common Sequence Operations.

Related help topics: LISTLITERALS

help> quit

You are now leaving help and returning to the Python interpreter.
If you want to ask for help on a particular object directly from the
interpreter, you can type "help(object)".  Executing "help('string')"
has the same effect as typing a particular string at the help> prompt.
>>> help('Shifiting')
No Python documentation found for 'Shifiting'.
Use help() to get the interactive help utility.
Use help(str) for help on the str class.

