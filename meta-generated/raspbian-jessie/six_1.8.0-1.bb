PACKAGES = "${PN} python-six"
PROVIDES = "python-six"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/six/python-six_1.8.0-1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_python-six = "python-six_1.8.0-1_all.deb"
SRC_URI[deb0.sha256sum] = "15e635be0154af9232cb30b10df8c598a274a9b55bbe5c0355aff51cc1e63e88"
SRC_URI[deb0.md5sum] = "0b6d5318373ee4eb069e375a5e2aa0b1"

RDEPENDS_python-${PN} = "python (<< 2.8) python (>= 2.7.5-5~)"
DEPENDS = "python"


inherit deb_group

FILES_python-six = " \
    ./usr/lib/python2.7/dist-packages/six-1.8.0.egg-info/PKG-INFO \
    ./usr/lib/python2.7/dist-packages/six-1.8.0.egg-info/dependency_links.txt \
    ./usr/lib/python2.7/dist-packages/six-1.8.0.egg-info/top_level.txt \
    ./usr/lib/python2.7/dist-packages/six.py \
    ./usr/share/doc/python-six/changelog.Debian.gz \
    ./usr/share/doc/python-six/changelog.gz \
    ./usr/share/doc/python-six/copyright\
"
