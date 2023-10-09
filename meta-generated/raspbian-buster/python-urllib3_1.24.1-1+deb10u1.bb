PACKAGES = "${PN} python-urllib3 python3-urllib3"
PROVIDES = "python-urllib3 python3-urllib3"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/python-urllib3/python-urllib3_1.24.1-1+deb10u1_all.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/p/python-urllib3/python3-urllib3_1.24.1-1+deb10u1_all.deb;unpack=0;name=deb1\
"
DEBFILENAME_python-urllib3 = "python-urllib3_1.24.1-1+deb10u1_all.deb"
SRC_URI[deb0.sha256sum] = "1ba95f0792819cadfad9b35690a80e508e18979d710346bbcdd5750dcbe5a5f4"
SRC_URI[deb0.md5sum] = "b049df180316c1ffd3a89ca1cfdaa4a6"
DEBFILENAME_python3-urllib3 = "python3-urllib3_1.24.1-1+deb10u1_all.deb"
SRC_URI[deb1.sha256sum] = "f36ff73e9997bb8e238fcb419e6acc6ba7d1bb4fef5e2d09ae000d91a6ab2142"
SRC_URI[deb1.md5sum] = "789480743d52c777a6a698ea6d8e3097"

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
