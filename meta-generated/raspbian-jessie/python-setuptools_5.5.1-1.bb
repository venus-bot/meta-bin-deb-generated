PACKAGES = "${PN} python-pkg-resources"
PROVIDES = "python-pkg-resources"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/python-setuptools/python-pkg-resources_5.5.1-1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_python-pkg-resources = "python-pkg-resources_5.5.1-1_all.deb"
SRC_URI[deb0.sha256sum] = "a6d6963f9a1943aee463356e462f7f5283938da6e810940514c1b6c8b8496595"
SRC_URI[deb0.md5sum] = "87ded88929c5dcf14628b5b24fac0386"

RDEPENDS_python-pkg-resources = "python (<< 2.8) python (>= 2.7)"
DEPENDS = "python"


inherit deb_group

FILES_python-pkg-resources = " \
    ./usr/lib/python2.7/dist-packages/pkg_resources.py \
    ./usr/share/doc/python-pkg-resources/README.Debian \
    ./usr/share/doc/python-pkg-resources/changelog.Debian.gz \
    ./usr/share/doc/python-pkg-resources/copyright \
    ./usr/share/doc/python-pkg-resources/pkg_resources.txt.gz\
"
