PACKAGES = "${PN} python-six"
PROVIDES = "python-six"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/s/six/python-six_1.12.0-1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_python-six = "python-six_1.12.0-1_all.deb"
SRC_URI[deb0.sha256sum] = "e2fab198138d00ca05a2c79aa5490acf87cf22e2496f45721c3b8837d32e3f3b"
SRC_URI[deb0.md5sum] = "669db15ba88922be0488855522f4514d"

RDEPENDS_python-${PN} = "python (<< 2.8) python (>= 2.7~)"
DEPENDS = "python"


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
