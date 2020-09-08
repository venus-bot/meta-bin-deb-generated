PACKAGES = "${PN} python-enum34"
PROVIDES = "python-enum34"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/e/enum34/python-enum34_1.1.6-2_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_python-enum34 = "python-enum34_1.1.6-2_all.deb"
SRC_URI[deb0.sha256sum] = "a30bcc8470ecefe1bc48194ce126e3b103bd80ee561c26bfab75d1df48108610"
SRC_URI[deb0.md5sum] = "c21c2621cec69a0ad30343d2ecf8d5fa"

RDEPENDS_python-${PN} = "python (<< 2.8) python (>= 2.7.5-5~)"
DEPENDS = "python"


inherit deb_group

FILES_python-enum34 = " \
    ./usr/lib/python2.7/dist-packages/enum/README \
    ./usr/lib/python2.7/dist-packages/enum/__init__.py \
    ./usr/lib/python2.7/dist-packages/enum/doc/enum.pdf \
    ./usr/lib/python2.7/dist-packages/enum/doc/enum.rst \
    ./usr/lib/python2.7/dist-packages/enum/test.py \
    ./usr/lib/python2.7/dist-packages/enum34-1.1.6.egg-info/PKG-INFO \
    ./usr/lib/python2.7/dist-packages/enum34-1.1.6.egg-info/dependency_links.txt \
    ./usr/lib/python2.7/dist-packages/enum34-1.1.6.egg-info/top_level.txt \
    ./usr/share/doc/python-enum34/changelog.Debian.gz \
    ./usr/share/doc/python-enum34/copyright \
    ./usr/share/lintian/overrides/python-enum34 \
    ./usr/share/python/dist/python-enum34\
"
