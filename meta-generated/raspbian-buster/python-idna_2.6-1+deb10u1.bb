PACKAGES = "${PN} python-idna python3-idna"
PROVIDES = "python-idna python3-idna"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/python-idna/python-idna_2.6-1+deb10u1_all.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/p/python-idna/python3-idna_2.6-1+deb10u1_all.deb;unpack=0;name=deb1\
"
DEBFILENAME_python-idna = "python-idna_2.6-1+deb10u1_all.deb"
SRC_URI[deb0.sha256sum] = "dec76ceae6106843f1d5236c96cd50e4c586d5b8d24198c321fd65c3c9158279"
SRC_URI[deb0.md5sum] = "643a834a0e5cb7962eab645b160569e2"
DEBFILENAME_python3-idna = "python3-idna_2.6-1+deb10u1_all.deb"
SRC_URI[deb1.sha256sum] = "d2cc1b14262e123021f408fd60f68803451c22841b0fed811779aac8f8ea4728"
SRC_URI[deb1.md5sum] = "3bd23fd2c426605aaa1cb59e4ad4a02f"

RDEPENDS_${PN} = "python (<< 2.8) python (>= 2.7~)"
RDEPENDS_python3-idna = "python3 (>= 3.3~)"
DEPENDS = "python python3"


inherit deb_group

FILES_${PN} = " \
    ./usr/lib/python2.7/dist-packages/idna-2.6.egg-info/PKG-INFO \
    ./usr/lib/python2.7/dist-packages/idna-2.6.egg-info/dependency_links.txt \
    ./usr/lib/python2.7/dist-packages/idna-2.6.egg-info/top_level.txt \
    ./usr/lib/python2.7/dist-packages/idna/__init__.py \
    ./usr/lib/python2.7/dist-packages/idna/codec.py \
    ./usr/lib/python2.7/dist-packages/idna/compat.py \
    ./usr/lib/python2.7/dist-packages/idna/core.py \
    ./usr/lib/python2.7/dist-packages/idna/idnadata.py \
    ./usr/lib/python2.7/dist-packages/idna/intranges.py \
    ./usr/lib/python2.7/dist-packages/idna/package_data.py \
    ./usr/lib/python2.7/dist-packages/idna/uts46data.py \
    ./usr/share/doc/python-idna/changelog.Debian.gz \
    ./usr/share/doc/python-idna/changelog.gz \
    ./usr/share/doc/python-idna/copyright\
"
FILES_python3-idna = " \
    ./usr/lib/python3/dist-packages/idna-2.6.egg-info/PKG-INFO \
    ./usr/lib/python3/dist-packages/idna-2.6.egg-info/dependency_links.txt \
    ./usr/lib/python3/dist-packages/idna-2.6.egg-info/top_level.txt \
    ./usr/lib/python3/dist-packages/idna/__init__.py \
    ./usr/lib/python3/dist-packages/idna/codec.py \
    ./usr/lib/python3/dist-packages/idna/compat.py \
    ./usr/lib/python3/dist-packages/idna/core.py \
    ./usr/lib/python3/dist-packages/idna/idnadata.py \
    ./usr/lib/python3/dist-packages/idna/intranges.py \
    ./usr/lib/python3/dist-packages/idna/package_data.py \
    ./usr/lib/python3/dist-packages/idna/uts46data.py \
    ./usr/share/doc/python3-idna/changelog.Debian.gz \
    ./usr/share/doc/python3-idna/changelog.gz \
    ./usr/share/doc/python3-idna/copyright\
"
