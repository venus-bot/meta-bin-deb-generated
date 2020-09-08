PACKAGES = "${PN} python-urllib3"
PROVIDES = "python-urllib3"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/p/python-urllib3/python-urllib3_1.24.1-1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_python-urllib3 = "python-urllib3_1.24.1-1_all.deb"
SRC_URI[deb0.sha256sum] = "e488eb220a80fa4e45f029a08171c701e494de5f261454372e574f8dc11b876e"
SRC_URI[deb0.md5sum] = "a5b1247172730f9d03caa555dc81684d"

RDEPENDS_${PN} = "python (<< 2.8) python (>= 2.7~) python-six"
DEPENDS = "python python-six"


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
