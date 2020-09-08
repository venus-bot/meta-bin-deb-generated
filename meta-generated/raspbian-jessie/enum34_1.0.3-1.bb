PACKAGES = "${PN} python-enum34"
PROVIDES = "python-enum34"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/e/enum34/python-enum34_1.0.3-1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_python-enum34 = "python-enum34_1.0.3-1_all.deb"
SRC_URI[deb0.sha256sum] = "c2ad2e3e2143b0e662768a6eb58df87901430f23f09900d69cdeff277fac474e"
SRC_URI[deb0.md5sum] = "dd48c02dde9455d17fe89e7186e32195"

RDEPENDS_python-${PN} = "python (<< 2.8) python (>= 2.7.5-5~)"
DEPENDS = "python"


inherit deb_group

FILES_python-enum34 = " \
    ./usr/lib/python2.7/dist-packages/enum/README \
    ./usr/lib/python2.7/dist-packages/enum/__init__.py \
    ./usr/lib/python2.7/dist-packages/enum/doc/enum.rst \
    ./usr/lib/python2.7/dist-packages/enum/enum.py \
    ./usr/lib/python2.7/dist-packages/enum/test_enum.py \
    ./usr/lib/python2.7/dist-packages/enum34-1.0.3.egg-info \
    ./usr/share/doc/python-enum34/changelog.Debian.gz \
    ./usr/share/doc/python-enum34/copyright\
"
