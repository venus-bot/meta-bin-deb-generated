PACKAGES = "${PN} python-pkg-resources"
PROVIDES = "python-pkg-resources"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/python-setuptools/python-pkg-resources_40.8.0-1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_python-pkg-resources = "python-pkg-resources_40.8.0-1_all.deb"
SRC_URI[deb0.sha256sum] = "4d6c21f3420a60a689949fc094c2615a3d79d527dd4b25c6886f52323a864061"
SRC_URI[deb0.md5sum] = "72ef31f372c8cd4ab81f51e0c7a0fb9b"

RDEPENDS_python-pkg-resources = "python (<< 2.8) python (>= 2.7~)"
DEPENDS = "python"


inherit deb_group

FILES_python-pkg-resources = " \
    ./usr/lib/python2.7/dist-packages/pkg_resources/__init__.py \
    ./usr/lib/python2.7/dist-packages/pkg_resources/_vendor/__init__.py \
    ./usr/lib/python2.7/dist-packages/pkg_resources/_vendor/appdirs.py \
    ./usr/lib/python2.7/dist-packages/pkg_resources/_vendor/packaging/__about__.py \
    ./usr/lib/python2.7/dist-packages/pkg_resources/_vendor/packaging/__init__.py \
    ./usr/lib/python2.7/dist-packages/pkg_resources/_vendor/packaging/_compat.py \
    ./usr/lib/python2.7/dist-packages/pkg_resources/_vendor/packaging/_structures.py \
    ./usr/lib/python2.7/dist-packages/pkg_resources/_vendor/packaging/markers.py \
    ./usr/lib/python2.7/dist-packages/pkg_resources/_vendor/packaging/requirements.py \
    ./usr/lib/python2.7/dist-packages/pkg_resources/_vendor/packaging/specifiers.py \
    ./usr/lib/python2.7/dist-packages/pkg_resources/_vendor/packaging/utils.py \
    ./usr/lib/python2.7/dist-packages/pkg_resources/_vendor/packaging/version.py \
    ./usr/lib/python2.7/dist-packages/pkg_resources/_vendor/pyparsing.py \
    ./usr/lib/python2.7/dist-packages/pkg_resources/_vendor/six.py \
    ./usr/lib/python2.7/dist-packages/pkg_resources/extern/__init__.py \
    ./usr/lib/python2.7/dist-packages/pkg_resources/py31compat.py \
    ./usr/share/doc/python-pkg-resources/changelog.Debian.gz \
    ./usr/share/doc/python-pkg-resources/changelog.gz \
    ./usr/share/doc/python-pkg-resources/copyright \
    ./usr/share/doc/python-pkg-resources/pkg_resources.txt.gz\
"
