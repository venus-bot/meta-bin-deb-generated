PACKAGES = "${PN} python-urllib3 python3-urllib3"
PROVIDES = "python-urllib3 python3-urllib3"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/python-urllib3/python-urllib3_1.24.1-1+deb10u2_all.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/p/python-urllib3/python3-urllib3_1.24.1-1+deb10u2_all.deb;unpack=0;name=deb1\
"
DEBFILENAME_python-urllib3 = "python-urllib3_1.24.1-1+deb10u2_all.deb"
SRC_URI[deb0.sha256sum] = "3a682c3f59cb25242310a37158e5aaf3aaa158230aa9b8632dc4bc5b1d6a2057"
SRC_URI[deb0.md5sum] = "03a191b20a667d2cb9ae2a1841e34636"
DEBFILENAME_python3-urllib3 = "python3-urllib3_1.24.1-1+deb10u2_all.deb"
SRC_URI[deb1.sha256sum] = "65b28887c2a56f57e34b50b4d3bc79ca60c4fd36255e5168a02da13ad1e70eaf"
SRC_URI[deb1.md5sum] = "84d50aea7853bf0d6ea1ce253b4fd930"

RDEPENDS_${PN} = "python (<< 2.8) python (>= 2.7~) python-six"
RDEPENDS_python3-urllib3 = "python3 python3-six"
DEPENDS = "python python-six python3 python3-six"


inherit deb_group

FILES_${PN} = " \
    ./usr/lib/python2.7/dist-packages/urllib3-1.24.1.egg-info/PKG-INFO \
    ./usr/lib/python2.7/dist-packages/urllib3-1.24.1.egg-info/dependency_links.txt \
    ./usr/lib/python2.7/dist-packages/urllib3-1.24.1.egg-info/requires.txt \
    ./usr/lib/python2.7/dist-packages/urllib3-1.24.1.egg-info/top_level.txt \
    ./usr/lib/python2.7/dist-packages/urllib3/__init__.py \
    ./usr/lib/python2.7/dist-packages/urllib3/_collections.py \
    ./usr/lib/python2.7/dist-packages/urllib3/connection.py \
    ./usr/lib/python2.7/dist-packages/urllib3/connectionpool.py \
    ./usr/lib/python2.7/dist-packages/urllib3/contrib/__init__.py \
    ./usr/lib/python2.7/dist-packages/urllib3/contrib/_appengine_environ.py \
    ./usr/lib/python2.7/dist-packages/urllib3/contrib/_securetransport/__init__.py \
    ./usr/lib/python2.7/dist-packages/urllib3/contrib/_securetransport/bindings.py \
    ./usr/lib/python2.7/dist-packages/urllib3/contrib/_securetransport/low_level.py \
    ./usr/lib/python2.7/dist-packages/urllib3/contrib/appengine.py \
    ./usr/lib/python2.7/dist-packages/urllib3/contrib/ntlmpool.py \
    ./usr/lib/python2.7/dist-packages/urllib3/contrib/pyopenssl.py \
    ./usr/lib/python2.7/dist-packages/urllib3/contrib/securetransport.py \
    ./usr/lib/python2.7/dist-packages/urllib3/contrib/socks.py \
    ./usr/lib/python2.7/dist-packages/urllib3/exceptions.py \
    ./usr/lib/python2.7/dist-packages/urllib3/fields.py \
    ./usr/lib/python2.7/dist-packages/urllib3/filepost.py \
    ./usr/lib/python2.7/dist-packages/urllib3/packages/__init__.py \
    ./usr/lib/python2.7/dist-packages/urllib3/packages/backports/__init__.py \
    ./usr/lib/python2.7/dist-packages/urllib3/packages/backports/makefile.py \
    ./usr/lib/python2.7/dist-packages/urllib3/packages/ssl_match_hostname/__init__.py \
    ./usr/lib/python2.7/dist-packages/urllib3/packages/ssl_match_hostname/_implementation.py \
    ./usr/lib/python2.7/dist-packages/urllib3/poolmanager.py \
    ./usr/lib/python2.7/dist-packages/urllib3/request.py \
    ./usr/lib/python2.7/dist-packages/urllib3/response.py \
    ./usr/lib/python2.7/dist-packages/urllib3/util/__init__.py \
    ./usr/lib/python2.7/dist-packages/urllib3/util/connection.py \
    ./usr/lib/python2.7/dist-packages/urllib3/util/queue.py \
    ./usr/lib/python2.7/dist-packages/urllib3/util/request.py \
    ./usr/lib/python2.7/dist-packages/urllib3/util/response.py \
    ./usr/lib/python2.7/dist-packages/urllib3/util/retry.py \
    ./usr/lib/python2.7/dist-packages/urllib3/util/ssl_.py \
    ./usr/lib/python2.7/dist-packages/urllib3/util/timeout.py \
    ./usr/lib/python2.7/dist-packages/urllib3/util/url.py \
    ./usr/lib/python2.7/dist-packages/urllib3/util/wait.py \
    ./usr/share/doc/python-urllib3/changelog.Debian.gz \
    ./usr/share/doc/python-urllib3/changelog.gz \
    ./usr/share/doc/python-urllib3/copyright\
"
FILES_python3-urllib3 = " \
    ./usr/lib/python3/dist-packages/urllib3-1.24.1.egg-info/PKG-INFO \
    ./usr/lib/python3/dist-packages/urllib3-1.24.1.egg-info/dependency_links.txt \
    ./usr/lib/python3/dist-packages/urllib3-1.24.1.egg-info/requires.txt \
    ./usr/lib/python3/dist-packages/urllib3-1.24.1.egg-info/top_level.txt \
    ./usr/lib/python3/dist-packages/urllib3/__init__.py \
    ./usr/lib/python3/dist-packages/urllib3/_collections.py \
    ./usr/lib/python3/dist-packages/urllib3/connection.py \
    ./usr/lib/python3/dist-packages/urllib3/connectionpool.py \
    ./usr/lib/python3/dist-packages/urllib3/contrib/__init__.py \
    ./usr/lib/python3/dist-packages/urllib3/contrib/_appengine_environ.py \
    ./usr/lib/python3/dist-packages/urllib3/contrib/_securetransport/__init__.py \
    ./usr/lib/python3/dist-packages/urllib3/contrib/_securetransport/bindings.py \
    ./usr/lib/python3/dist-packages/urllib3/contrib/_securetransport/low_level.py \
    ./usr/lib/python3/dist-packages/urllib3/contrib/appengine.py \
    ./usr/lib/python3/dist-packages/urllib3/contrib/ntlmpool.py \
    ./usr/lib/python3/dist-packages/urllib3/contrib/pyopenssl.py \
    ./usr/lib/python3/dist-packages/urllib3/contrib/securetransport.py \
    ./usr/lib/python3/dist-packages/urllib3/contrib/socks.py \
    ./usr/lib/python3/dist-packages/urllib3/exceptions.py \
    ./usr/lib/python3/dist-packages/urllib3/fields.py \
    ./usr/lib/python3/dist-packages/urllib3/filepost.py \
    ./usr/lib/python3/dist-packages/urllib3/packages/__init__.py \
    ./usr/lib/python3/dist-packages/urllib3/packages/backports/__init__.py \
    ./usr/lib/python3/dist-packages/urllib3/packages/backports/makefile.py \
    ./usr/lib/python3/dist-packages/urllib3/packages/ssl_match_hostname/__init__.py \
    ./usr/lib/python3/dist-packages/urllib3/packages/ssl_match_hostname/_implementation.py \
    ./usr/lib/python3/dist-packages/urllib3/poolmanager.py \
    ./usr/lib/python3/dist-packages/urllib3/request.py \
    ./usr/lib/python3/dist-packages/urllib3/response.py \
    ./usr/lib/python3/dist-packages/urllib3/util/__init__.py \
    ./usr/lib/python3/dist-packages/urllib3/util/connection.py \
    ./usr/lib/python3/dist-packages/urllib3/util/queue.py \
    ./usr/lib/python3/dist-packages/urllib3/util/request.py \
    ./usr/lib/python3/dist-packages/urllib3/util/response.py \
    ./usr/lib/python3/dist-packages/urllib3/util/retry.py \
    ./usr/lib/python3/dist-packages/urllib3/util/ssl_.py \
    ./usr/lib/python3/dist-packages/urllib3/util/timeout.py \
    ./usr/lib/python3/dist-packages/urllib3/util/url.py \
    ./usr/lib/python3/dist-packages/urllib3/util/wait.py \
    ./usr/share/doc/python3-urllib3/changelog.Debian.gz \
    ./usr/share/doc/python3-urllib3/changelog.gz \
    ./usr/share/doc/python3-urllib3/copyright\
"
