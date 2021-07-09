PACKAGES = "${PN} python-six python3-six"
PROVIDES = "python-six python3-six"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/six/python-six_1.12.0-1_all.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/s/six/python3-six_1.12.0-1_all.deb;unpack=0;name=deb1\
"
DEBFILENAME_python-six = "python-six_1.12.0-1_all.deb"
SRC_URI[deb0.sha256sum] = "e2fab198138d00ca05a2c79aa5490acf87cf22e2496f45721c3b8837d32e3f3b"
SRC_URI[deb0.md5sum] = "669db15ba88922be0488855522f4514d"
DEBFILENAME_python3-six = "python3-six_1.12.0-1_all.deb"
SRC_URI[deb1.sha256sum] = "ec43cea7798b07e39ad53bb4088f6db17ef1fb01abaebab0641da0ba0e6819e4"
SRC_URI[deb1.md5sum] = "75af07221e0fa0539032c01a5bc0f423"

RDEPENDS_python-${PN} = "python (<< 2.8) python (>= 2.7~)"
RDEPENDS_python3-${PN} = "python3"
DEPENDS = "python python3"


inherit deb_group

FILES_python-six = " \
    ./usr/lib/python2.7/dist-packages/six-1.12.0.egg-info/PKG-INFO \
    ./usr/lib/python2.7/dist-packages/six-1.12.0.egg-info/dependency_links.txt \
    ./usr/lib/python2.7/dist-packages/six-1.12.0.egg-info/top_level.txt \
    ./usr/lib/python2.7/dist-packages/six.py \
    ./usr/share/doc/python-six/changelog.Debian.gz \
    ./usr/share/doc/python-six/changelog.gz \
    ./usr/share/doc/python-six/copyright \
    ./usr/share/python/dist/python-six\
"
FILES_python3-six = " \
    ./usr/lib/python3/dist-packages/six-1.12.0.egg-info/PKG-INFO \
    ./usr/lib/python3/dist-packages/six-1.12.0.egg-info/dependency_links.txt \
    ./usr/lib/python3/dist-packages/six-1.12.0.egg-info/top_level.txt \
    ./usr/lib/python3/dist-packages/six.py \
    ./usr/share/doc/python3-six/changelog.Debian.gz \
    ./usr/share/doc/python3-six/changelog.gz \
    ./usr/share/doc/python3-six/copyright \
    ./usr/share/python3/dist/python3-six\
"
