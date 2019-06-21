PACKAGES = "${PN} python-urllib3"
PROVIDES = "python-urllib3"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/python-urllib3/python-urllib3_1.9.1-3+deb8u1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_python-urllib3 = "python-urllib3_1.9.1-3+deb8u1_all.deb"
SRC_URI[deb0.sha256sum] = "e27d99ad5c0b5e5299b8868e00a6cacaa6adbbb532874e95e893c27d36f2a25f"
SRC_URI[deb0.md5sum] = "897db5703e814b71168f8fa70a4984e1"

RDEPENDS_${PN} = "python (<< 2.8) python (>= 2.7.5-5~) python-six"
DEPENDS = "python python-six"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
    ./usr/lib/python2.7/dist-packages/urllib3-1.9.1.egg-info/PKG-INFO \
    ./usr/lib/python2.7/dist-packages/urllib3-1.9.1.egg-info/dependency_links.txt \
    ./usr/lib/python2.7/dist-packages/urllib3-1.9.1.egg-info/top_level.txt \
    ./usr/lib/python2.7/dist-packages/urllib3/__init__.py \
    ./usr/lib/python2.7/dist-packages/urllib3/_collections.py \
    ./usr/lib/python2.7/dist-packages/urllib3/connection.py \
    ./usr/lib/python2.7/dist-packages/urllib3/connectionpool.py \
    ./usr/lib/python2.7/dist-packages/urllib3/contrib/__init__.py \
    ./usr/lib/python2.7/dist-packages/urllib3/contrib/ntlmpool.py \
    ./usr/lib/python2.7/dist-packages/urllib3/contrib/pyopenssl.py \
    ./usr/lib/python2.7/dist-packages/urllib3/exceptions.py \
    ./usr/lib/python2.7/dist-packages/urllib3/fields.py \
    ./usr/lib/python2.7/dist-packages/urllib3/filepost.py \
    ./usr/lib/python2.7/dist-packages/urllib3/packages/__init__.py \
    ./usr/lib/python2.7/dist-packages/urllib3/packages/ordered_dict.py \
    ./usr/lib/python2.7/dist-packages/urllib3/packages/ssl_match_hostname/__init__.py \
    ./usr/lib/python2.7/dist-packages/urllib3/packages/ssl_match_hostname/_implementation.py \
    ./usr/lib/python2.7/dist-packages/urllib3/poolmanager.py \
    ./usr/lib/python2.7/dist-packages/urllib3/request.py \
    ./usr/lib/python2.7/dist-packages/urllib3/response.py \
    ./usr/lib/python2.7/dist-packages/urllib3/util/__init__.py \
    ./usr/lib/python2.7/dist-packages/urllib3/util/connection.py \
    ./usr/lib/python2.7/dist-packages/urllib3/util/request.py \
    ./usr/lib/python2.7/dist-packages/urllib3/util/response.py \
    ./usr/lib/python2.7/dist-packages/urllib3/util/retry.py \
    ./usr/lib/python2.7/dist-packages/urllib3/util/ssl_.py \
    ./usr/lib/python2.7/dist-packages/urllib3/util/timeout.py \
    ./usr/lib/python2.7/dist-packages/urllib3/util/url.py \
    ./usr/share/doc/python-urllib3/changelog.Debian.gz \
    ./usr/share/doc/python-urllib3/changelog.gz \
    ./usr/share/doc/python-urllib3/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
